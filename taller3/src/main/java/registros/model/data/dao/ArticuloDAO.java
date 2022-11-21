package registros.model.data.dao;

import org.jooq.DSLContext;
import org.jooq.Field;
import org.jooq.Result;
import org.jooq.Table;
import org.jooq.impl.DSL;
import registros.model.Articulo;

import java.util.ArrayList;
import java.util.List;

import static org.jooq.impl.DSL.name;
import static org.jooq.impl.DSL.table;
public class ArticuloDAO {
    public static void agregarArticulo(DSLContext query, Articulo articulo){
        Table tablaArticulo= table(name("Articulo"));
        Field[] columnas = tablaArticulo.fields("nombre del articulo ","tipo de articulo","codigo", "peso", "precio");
        query.insertInto(tablaArticulo, columnas[0], columnas[1],columnas[2],columnas[3],columnas[4])
                .values(articulo.getNombreArticulo(),articulo.getTipoArticulo(),articulo.getCodigoArticulo(),articulo.getPeso(),articulo.getPrecio())
                .execute();
    }
    public static void modificarArticulo(DSLContext query, String codigo, String columnaTabla, Object dato){
        query.update(DSL.table("Articulo")).set(DSL.field(columnaTabla),dato).
                where(DSL.field("codigo").eq(codigo)).execute();
    }
    public static List obtenerArticulo(DSLContext query, String columnaTabla, Object dato){
        Result resultados = query.select().from(DSL.table("Articulo")).where(DSL.field(columnaTabla).eq(dato)).fetch();
        return obtenerListaArticulos(resultados);
    }
    public static List obtenerArticulos(DSLContext query){
        Result resultados = query.select().from(DSL.table("Cliente")).fetch();
        return obtenerListaArticulos(resultados);
    }


    private static void buscarArticulo(){

    }

    private static List obtenerListaArticulos(Result resultados){

        List<Articulo> articulos= new ArrayList<>();
        for(int fila=0; fila<resultados.size();fila++){
            String nombreArticulo = (String) resultados.getValue(fila,"nombre del articulo");
            String tipoArticulo = (String) resultados.getValue(fila,"tipo de articulo");
            String codigo = (String) resultados.getValue(fila,"codigo");
            String peso = (String) resultados.getValue(fila,"peso");
            String precio = (String) resultados.getValue(fila,"precio");
            articulos.add(new Articulo(nombreArticulo, tipoArticulo, nombreArticulo,tipoArticulo,codigo));
        }
        return articulos;
    }

    public static boolean validarExistenciaArtculo(DSLContext query, String codigo, String codigoArticulo) {
        return false;
    }

    public static Object[] getCodigoArticulos(DSLContext query) {
        return new Object[0];
    }

    public static List obtenerListaArticulos(DSLContext query, String articulo, String nombreArticulo) {
        return null;
    }
}
