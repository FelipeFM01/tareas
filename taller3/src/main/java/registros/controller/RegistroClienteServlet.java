package registros.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.jooq.DSLContext;
import registros.model.Cliente;
import registros.model.data.DBGenerator;
import registros.model.data.dao.ClienteDAO;

import java.io.IOException;
import java.util.List;


@WebServlet(name = "registroClienteServlet", value = "/registroCliente")
public class RegistroClienteServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        try {
            DBGenerator.iniciarBD("Libreria");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //La respuesta que le vamos a devolver, va a ser la dirección del archivo JSP registrocliente.jsp
        RequestDispatcher respuesta = req.getRequestDispatcher("/registroCliente.jsp");
        //envía la respuesta
        respuesta.forward(req,resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException  {
        RequestDispatcher respuesta = req.getRequestDispatcher("/registroClienteErroneo.jsp");
        if(req.getParameter("nombre").length()!=0 && req.getParameter("rut").length()!=0  &&
                req.getParameter("correo electronico").length()!=0){
            String nombre = req.getParameter("nombre");
            String rut = req.getParameter("rut");
            String correoElectronico = req.getParameter("correo electronico");
            Cliente cliente = new Cliente(nombre, rut, correoElectronico);
            try {
                if(agregarCliente(cliente)){
                    req.setAttribute("cliente",cliente);
                    respuesta = req.getRequestDispatcher("/registroClienteExitoso.jsp");
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        respuesta.forward(req,resp);
    }

    private static boolean agregarCliente(Cliente cliente) throws ClassNotFoundException {
        DSLContext query= DBGenerator.conectarBD("Libreria");
        List clientes = ClienteDAO.obtenerListaClientes(query,"nombre", cliente.getNombre());
        if(clientes.size()!=0){
            return false;
        }
        else{
            ClienteDAO.agregarCliente(query,cliente);
            return true;
        }
    }


}
