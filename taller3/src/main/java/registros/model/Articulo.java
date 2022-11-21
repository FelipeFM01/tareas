package registros.model;

import javax.swing.*;

public class Articulo {
    protected ComboBoxModel<Object> TipoArticulo;
    private String nombreArticulo;
    private String tipoArticulo;
    private String codigoArticulo;
    private String peso;
    private String precio;

    public Articulo(String s, String articulo, String nombreArticulo, String tipoArticulo, String codigo){
        this.nombreArticulo = nombreArticulo;
        this.tipoArticulo = tipoArticulo;  // articulos como : cuadernos, lápices, libros,
        this.codigoArticulo = codigo;  // codigo de articulo
        this.peso = peso;       //   en [Kg]
        this.precio = precio;
    }

    public String getNombreArticulo() {return nombreArticulo;}

    public void setNombreArticulo(String nombreArticulo) {this.nombreArticulo = nombreArticulo;}


    public String getTipoArticulo() {return tipoArticulo;}

    public void setTipoArticulo(String tipoArticulo) {this.tipoArticulo = tipoArticulo;}


    public String getCodigoArticulo() {return codigoArticulo;}

    public void setCodigoArticulo(String codigoArticulo) {this.codigoArticulo = codigoArticulo;}


    public String getPeso() {return peso;}

    public void setPeso(String peso) {this.peso = peso;}


    public String getPrecio() {return precio;}

    public void setPrecio(String precio) {this.precio = precio;}



}
