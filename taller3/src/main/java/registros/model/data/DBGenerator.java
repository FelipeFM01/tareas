package registros.model.data;

import org.jooq.DSLContext;
import org.jooq.DataType;
import org.jooq.impl.DSL;

import java.sql.Connection;

import static org.jooq.impl.DSL.foreignKey;
import static org.jooq.impl.DSL.primaryKey;
import static org.jooq.impl.SQLDataType.INTEGER;
import static org.jooq.impl.SQLDataType.VARCHAR;

public class DBGenerator {

    public static void iniciarBD(String nombreBD) throws ClassNotFoundException {
        Connection connection = DBConnector.connection("root","");
        DSLContext create = DSL.using(connection);
        crearBaseDato(create,nombreBD);
        create = actualizarConexion(connection,nombreBD);
        crearTablaArticulos(create);
        crearTablaCliente(create);                        // codigo-articulo
        relacionarTabla(create,"Cliente","codigo","Articulo");
        DBConnector.closeConnection();

    }
    //Metodo para conectarse a una base de datos ya creada
    public static DSLContext conectarBD(String nombre) throws ClassNotFoundException {
        Connection connection = DBConnector.connection(nombre,"root","");
        DSLContext create = DSL.using(connection);
        return create;
    }
    //Crea una base de datos en caso de que no exista
    private static void crearBaseDato(DSLContext create, String nombreBD){
        create.createDatabaseIfNotExists(nombreBD).execute();
    }

    //Actualiza la conexion inicial para conectar a la base de datos
    private static DSLContext actualizarConexion(Connection connection,String nombreBD){
        DBConnector.closeConnection();
        connection= DBConnector.connection(nombreBD,"root","");
        DSLContext create= DSL.using(connection);
        return create;
    }


    //     GENERAR 2 TIPOS DE TABLAS:
    //     OTRA PARA LOS CLIENTES
    //     Y
    //     UNA PARA LOS ARTICULOS




    //  P A R A     L O S       C L I E N T E S
    private static void crearTablaCliente(DSLContext create){
        create.createTableIfNotExists("Clientes").column("rut",VARCHAR(9))  // length es el tamaño de caracteres
                .column("nombre",VARCHAR(50))
                .column("correoElectronico",VARCHAR(50))
                .column("articulos seleccionados", INTEGER)
                .constraint(primaryKey("rut")).execute();
        //    rut será la clave primaria
    }

    //  P A R A     L O S       A R T I C U L O S
    private static void crearTablaArticulos(DSLContext create){
        create.createTableIfNotExists("Articulos").column("nombre-articulo",VARCHAR(50))  // length es el tamaño de caracteres
                .column("nombre", VARCHAR(90))
                .column("codigo",VARCHAR(50))
                .column("tipo-articulo",VARCHAR(50))
                .column("peso  (kg)", INTEGER)
                .column("precio (clp)", VARCHAR(6))
                .constraint(primaryKey("codigo")).execute();
        //    codigo será la clave primaria
    }

    //Relaciona dos tablas a traves de una clave foranea
    private static void relacionarTabla(DSLContext create, String nombreTabla, String claveForanea, String nombreTablaRelacion){
        //  create.alterTableIfExists(nombreTabla).add(foreignKey(claveForanea).references(nombreTablaRelacion)).execute();
        create.alterTableIfExists(nombreTabla).alterConstraint(foreignKey(claveForanea).references(nombreTablaRelacion)).enforced();
    }
    private static void agregarColumnaTabla(DSLContext create, String nombreTabla, String columna, DataType tipoColumna){
        create.alterTableIfExists(nombreTabla).addColumn(columna,tipoColumna);
    }











}
