package registros.model.data.dao;

import org.jooq.DSLContext;
import org.jooq.Field;
import org.jooq.Result;
import org.jooq.Table;
import org.jooq.impl.DSL;
import registros.model.Cliente;

import java.util.ArrayList;
import java.util.List;

import static org.jooq.impl.DSL.name;
import static org.jooq.impl.DSL.table;

public class ClienteDAO {
    private static DSL query;

    public static void agregarCliente(DSLContext query, Cliente cliente){
        Table tablaCliente= table(name("Cliente"));
        Field[] columnas = tablaCliente.fields("nombre","rut","correo Electronico");
        query.insertInto(tablaCliente, columnas[0], columnas[1],columnas[2])
                .values(cliente.getNombre(),cliente.getRut(),cliente.getCorreoElectronico())
                .execute();

    }

    public static void modificarCliente(String rut, String columnaTabla, Object dato){
        query.update(DSL.table("Cliente")).set(DSL.field(columnaTabla),dato).
                where(DSL.field("rut").eq(rut)).execute();
    }
    public static List obtenerCliente(DSLContext query, String columnaTabla, Object dato) {
        Result resultados = query.select().from(DSL.table("Cliente")).where(DSL.field(columnaTabla).eq(dato)).fetch();
        return obtenerListaClientes(resultados);
    }
    public static List obtenerClientes(DSLContext query){
        Result resultados = query.select().from(DSL.table("Cliente")).fetch();
        return obtenerListaClientes(resultados);
    }




    public void eliminarCliente(DSLContext query, String rut){
        Table tablaCliente= table(name("Cliente"));
        query.delete(DSL.table("Cliente")).where(DSL.field("rut").eq(rut)).execute();
    }

    public static List obtenerListaClientes(DSLContext query, String nombre, String rut) {
        return null;
    }
    private static List obtenerListaClientes(Result resultados){
        List<Cliente> clientes= new ArrayList<>();
        for(int fila=0; fila<resultados.size();fila++){
            String nombre = (String) resultados.getValue(fila,"nombre");
            String rut = (String) resultados.getValue(fila,"rut");
            String correoElectronico = (String) resultados.getValue(fila,"correoElectronico");
            clientes.add(new Cliente(nombre,rut,correoElectronico));
        }
        return clientes;
    }


}
