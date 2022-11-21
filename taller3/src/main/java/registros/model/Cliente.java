package registros.model;

import java.util.List;

public class Cliente {      // clientes de la libreria

    //      CADA CLIENTE DEBE TENER SU nombre,rut y  correo electrónico asociado a la libreria

    private String nombre;
    private String rut;
    private String correoElectronico;

    public Cliente(String nombre, String rut, String correoElectronico){
        this.nombre = nombre;
        this.rut = rut;
        this.correoElectronico = correoElectronico;
    }




    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}


    public String getRut() {return rut;}

    public void setRut(String rut) {this.rut = rut;}


    public String getCorreoElectronico() {return correoElectronico;}

    public void setCorreoElectronico(String correoElectronico) {this.correoElectronico = correoElectronico;}
}
