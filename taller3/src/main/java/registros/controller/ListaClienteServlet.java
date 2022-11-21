package registros.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import registros.model.Cliente;
import registros.model.data.DBGenerator;
import registros.model.data.dao.ClienteDAO;

import javax.xml.transform.Result;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "listaClienteServlet", value = "/mostrarClientes")
public class ListaClienteServlet extends HttpServlet {
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
        try {
            req.setAttribute("clientes",agregarClientesEjemplo());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        RequestDispatcher respuesta = req.getRequestDispatcher("/mostrarClientes.jsp");
        respuesta.forward(req,resp);
    }

    // hacer sevlet registro cliente
    private List agregarClientesEjemplo() throws ClassNotFoundException {

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Juan Perez", "205867451", "juan.p@mail.cl"));
        clientes = ClienteDAO.obtenerClientes(DBGenerator.conectarBD("Libreria"));
        return clientes;
    }


}
