package Model;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// Esta clase se encarga de gestionar los datos mediante una tabla

public class VentanaTabla extends JFrame {

    private String[][] datos;
    private String[] nombreColumnas;
    /**
     * El constructor inicializa la tabla con los datos entregados por parámetro
     *
     * @param datos
     * @param nombreColumnas
     */
    public VentanaTabla(String[][] datos, String[] nombreColumnas) {
        super("Lista de datos");
        this.datos = datos;
        this.nombreColumnas = nombreColumnas;
        generarTabla();
        super.setLocationRelativeTo(null);
        super.setResizable(false);
        this.pack();
        this.setVisible(true);
    }
    public boolean isCellEditable(int row, int column) {
        return false;
    }
    public void generarTabla() {
        DefaultTableModel dtm = new DefaultTableModel(this.datos, this.nombreColumnas) {
            //Se edita un método de la tabla para que no se permita modificar los datos
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        final JTable tabla = new JTable(dtm);
        tabla.setPreferredScrollableViewportSize(new Dimension(500, 200));
        JScrollPane scrollPane = new JScrollPane(tabla);
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                cerrarVentana();
            }
        });
    }
    private void cerrarVentana() {
        this.dispose();
    }

}
