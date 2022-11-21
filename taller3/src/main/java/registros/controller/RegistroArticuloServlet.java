package registros.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.jooq.DSLContext;
import registros.model.Articulo;
import registros.model.data.DBGenerator;
import registros.model.data.dao.ArticuloDAO;
import registros.model.data.dao.ClienteDAO;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "RegistroArticuloServlet", value = "/registroArticulo")

public class RegistroArticuloServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        try {
            DBGenerator.iniciarBD("Libreria");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //La respuesta que le vamos a devolver, va a ser la dirección del archivo JSP registrocliente.jsp
        RequestDispatcher respuesta = req.getRequestDispatcher("/registroArticulo.jsp");
        //envía la respuesta
        respuesta.forward(req,resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException  {
        RequestDispatcher respuesta = req.getRequestDispatcher("/registroArticuloErroneo.jsp");
        if(req.getParameter("nombreArticulo").length()!=0 &&
                req.getParameter("tipoArticulo").length()!=0  &&
                req.getParameter("codigoArticulo").length()!=0  &&
                req.getParameter("peso").length()!=0  &&
                req.getParameter("precio").length()!=0){
            String nombreArticulo = req.getParameter("nombreArticulo");
            String tipoArticulo = req.getParameter("tipoArticulo");
            String codigoArticulo = req.getParameter("codigoArticulo");
            String peso = req.getParameter("peso");
            String precio = req.getParameter("precio");
            Articulo articulo = new Articulo(nombreArticulo, tipoArticulo, codigoArticulo, peso, precio);
            try {
                if(agregarArticulo(articulo)){
                    req.setAttribute("articulo",articulo);
                    respuesta = req.getRequestDispatcher("/registroArticuloExitoso.jsp");
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        respuesta.forward(req,resp);
    }
    private static boolean agregarArticulo(Articulo articulo) throws ClassNotFoundException {
        DSLContext query= DBGenerator.conectarBD("Libreria");
        List articulos = ArticuloDAO.obtenerListaArticulos(query,"articulo", articulo.getNombreArticulo());
        if(articulos.size()!=0){
            return false;
        }
        else{
            ArticuloDAO.agregarArticulo(query,articulo);
            return true;
        }
    }
}
