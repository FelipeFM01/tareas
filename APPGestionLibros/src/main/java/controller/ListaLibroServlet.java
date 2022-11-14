package controller;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Libro;
import model.data.DBGenerator;
import model.data.dao.LibroDAO;
import org.jooq.exception.IOException;

import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "listaLibroServlet", value = "/mostrarLibros")
public class ListaLibroServlet extends HttpServlet {
    @Override
    public void init() throws ServletException{
        try {
            DBGenerator.iniciarBD("LibrosBD");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, java.io.IOException {
        try {
            req.setAttribute("libros",agregarLibrosEjemplo());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        RequestDispatcher respuesta = req.getRequestDispatcher("/mostrarLibros.jsp");
        respuesta.forward(req,resp);
    }
    private List agregarLibrosEjemplo() throws ClassNotFoundException {

        List<Libro> libros = new ArrayList<>();
        libros.add(new Libro("La filosofía de HOUSE: TODOS MIENTEN", "SELECTOR", "Filosofia", "2009", "Fisico"));
        return libros;
    }





}
