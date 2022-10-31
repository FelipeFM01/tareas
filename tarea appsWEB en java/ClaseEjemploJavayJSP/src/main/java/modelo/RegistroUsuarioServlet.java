package modelo;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "RegistroUsuarioServlet", value = "/registroUsuario")
public class RegistroUsuarioServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //la respuesta que le vamos a devolver, va a ser la direccion del archivo JSP registroUsuario.JSP
        RequestDispatcher respuesta = req.getRequestDispatcher("/registroUsuario.jsp");
        //envia la respuesta
        respuesta.forward(req,resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getParameter("nombre").length()==0 || req.getParameter("edad").length()==0 || req.getParameter("rut").length()==0){
            RequestDispatcher respuesta = req.getRequestDispatcher("/registroErroneo.jsp");
            respuesta.forward(req,resp);
        }// req: request--> respuesta que envia la pag
        else {
            String nombre= req.getParameter("nombre");
            int edad = Integer.parseInt(req.getParameter("edad"));
            String rut= req.getParameter("rut");
            Usuario usuario = new Usuario(nombre, edad, rut);
            RequestDispatcher respuesta = req.getRequestDispatcher("/index.jsp");
            respuesta.forward(req,resp);
        }

    }
}
