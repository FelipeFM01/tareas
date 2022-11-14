package model.data.dao;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import model.Libro;
import org.jooq.DSLContext;
import org.jooq.Field;
import org.jooq.Result;
import org.jooq.Table;
import org.jooq.impl.DSL;

import java.util.ArrayList;
import java.util.List;

import static org.jooq.impl.DSL.name;
import static org.jooq.impl.DSL.table;

public class LibroDAO {
    public static void agregarLibro(DSLContext query, Libro libro){
        Table tablaLibro= table(name("Libro"));
        Field[] columnas = tablaLibro.fields("nombre","editorial","categoria", "año", "tipo");
        query.insertInto(tablaLibro, columnas[0], columnas[1],columnas[2],columnas[3],columnas[4]).values(libro.getNombre(),libro.getEditorial(),libro.getCategoria(),libro.getAño(),libro.getTipo()).execute();
    }
    public static void modificarLibro(DSLContext query, String nombre, String columnaTabla, MysqlxDatatypes.Object dato){
        query.update(DSL.table("Libro")).set(DSL.field(columnaTabla),dato).
                where(DSL.field("nombe").eq(nombre)).execute();
    }
    public static List obtenerLibro(DSLContext query, String columnaTabla, Object dato){
        Result resultados = query.select().from(DSL.table("Libro")).where(DSL.field(columnaTabla).eq(dato)).fetch();
        return obtenerListaLibros(resultados);
    }
    public static List obtenerLibros(DSLContext query){
        Result resultados = query.select().from(DSL.table("Libro")).fetch();
        return obtenerListaLibros(resultados);
    }
    public static void eliminarLibro(DSLContext query, String nombre){
        Table tablaLibro= table(name("Libro"));
        query.delete(DSL.table("Libro")).where(DSL.field("nombre").eq(nombre)).execute();
    }
    private static List obtenerListaLibros(Result resultados){
        List<Libro> libros= new ArrayList<>();
        for(int fila=0; fila<resultados.size();fila++){
            String nombre = (String) resultados.getValue(fila,"nombre");
            String editorial = (String) resultados.getValue(fila,"editorial");
            String categoria = (String) resultados.getValue(fila,"categoria");
            String año = (String) resultados.getValue(fila,"año");
            String tipo = (String) resultados.getValue(fila,"tipo");
            libros.add(new Libro(nombre,categoria,editorial,año,tipo));
        }
        return libros;
    }



}
