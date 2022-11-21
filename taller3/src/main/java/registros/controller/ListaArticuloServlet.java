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

import java.io.IOException;
import java.util.List;

@WebServlet(name = "ListaArticuloServlet", value = "/mostrarArticulos")
public class ListaArticuloServlet extends HttpServlet {
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
        //La respuesta que le vamos a devolver, va a ser la dirección del archivo JSP registroArticulo.jsp
        RequestDispatcher respuesta = req.getRequestDispatcher("/mostrarArticulos.jsp");
        //envía la respuesta
        respuesta.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher respuesta = req.getRequestDispatcher("/registroArticuloErroneo.jsp");
        if (req.getParameter("tipo de articulo").length() != 0 && req.getParameter("nombre").length() != 0 &&
                req.getParameter("codigo").length() != 0 && req.getParameter("peso").length() != 0 && req.getParameter("precio").length() != 0) {
            String nombreArticulo = req.getParameter("nombre de articulo");
            String tipoArticulo = req.getParameter("tipo de articulo");
            String categoria = req.getParameter("codigo");
            String peso = req.getParameter("peso");
            String precio = req.getParameter("precio");
            Articulo articulo = new Articulo(nombreArticulo, tipoArticulo, nombreArticulo, tipoArticulo, categoria);
            try {
                if (agregarArticulo(articulo)) {
                    req.setAttribute("NombreArticulo", articulo);
                    respuesta = req.getRequestDispatcher("/registroArticuloExitoso.jsp");
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        respuesta.forward(req, resp);
    }

    private boolean agregarArticulo(Articulo articulo) throws ClassNotFoundException {
        DSLContext query = DBGenerator.conectarBD("Libreria");
        List<Articulo> articulos = ArticuloDAO.obtenerArticulo(query, "nombre del articulo", articulo.getNombreArticulo());
        if (articulos.size() != 0) {
            return false;
        } else {
            ArticuloDAO.agregarArticulo(query, articulo);
            return true;
        }
    }

    private boolean buscarArticulo(Articulo articulo) throws ClassNotFoundException {

        return false;
    }
}
