package model;

public class Libro {
    private String nombre;
    private String editorial;
    private String categoria;
    private String año;
    private String tipo;  // el tipo de libro puede estar en  FISICO  O  DIGITAL

    public Libro(String nombre, String editorial, String categoria, String año, String tipo){
        this.nombre = nombre;
        this.editorial = editorial;
        this.categoria = categoria;
        this.año = año;
        this.tipo = tipo;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getCategoria() {
            return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }










}
