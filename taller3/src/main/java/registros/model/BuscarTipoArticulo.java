package registros.model;

import javax.swing.*;
import java.awt.*;

public class BuscarTipoArticulo extends Articulo {

    private ComboBoxModel<Object> listacodigo;
    private Label campoNombreArticulo;
    private Object botonBuscar;

    public BuscarTipoArticulo(String nombreArticulo, String tipoArticulo, String codigo) {
        super(nombreArticulo, tipoArticulo, nombreArticulo, tipoArticulo, codigo);
    }
// falta terminar

}