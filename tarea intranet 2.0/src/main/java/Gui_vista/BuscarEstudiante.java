package Gui_vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BuscarEstudiante extends JFrame {

    private final JDialog frame = null;
    private final Component label = null;
    private JPanel PanelBuscarEstudiante;
    private JTextField txtFieldnombreEstudiante;
    private JComboBox comboBoxbuscarCarrera;
    private JButton regresarButton;
    private JButton buscarButton;
    private JTable buscarEstudiantestable;
    private JTable tableEstudiantes;


    public BuscarEstudiante() {
        add(PanelBuscarEstudiante);
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);


        DefaultComboBoxModel comboBoxbuscarCarreraModel = new DefaultComboBoxModel();
        comboBoxbuscarCarrera.setModel(comboBoxbuscarCarreraModel);
        comboBoxbuscarCarreraModel.addElement("ICI-I");
        comboBoxbuscarCarreraModel.addElement("ICI-B");
        comboBoxbuscarCarreraModel.addElement("ICI-M");
        comboBoxbuscarCarreraModel.addElement("Ingenieria Civil Industrial");
        comboBoxbuscarCarreraModel.addElement("Ingenieria Civil");
        comboBoxbuscarCarreraModel.addElement("Ingenieria Civil Ambiental");
        comboBoxbuscarCarreraModel.addElement("Ingenieria Civil Biotecnología");
        comboBoxbuscarCarreraModel.addElement("Ingenieria Civil Electrica");
        comboBoxbuscarCarreraModel.addElement("Ingenieria Civil Electronica");
        comboBoxbuscarCarreraModel.addElement("Ingenieria Civil Fisica");
        comboBoxbuscarCarreraModel.addElement("Ingenieria Civil Quimica");
        comboBoxbuscarCarreraModel.addElement("Ingenieria Civil Informatica");
        comboBoxbuscarCarreraModel.addElement("Ingenieria Civil Telematica");
        comboBoxbuscarCarreraModel.addElement("Ingenieria Civil Matematica");
        comboBoxbuscarCarreraModel.addElement("Ingenieria Civil Mecanica");
        comboBoxbuscarCarreraModel.addElement("Ingenieria Informatica");
        comboBoxbuscarCarreraModel.addElement("Ingenieria en Construccion");
        comboBoxbuscarCarreraModel.addElement("Plan Comun Ingenieria Civil");

        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String comboBoxbuscarCarrera = comboBoxbuscarCarreraModel.getSelectedItem().toString();
                JOptionPane.showMessageDialog(null, comboBoxbuscarCarrera);
            }
        });

        regresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtFieldnombreEstudiante.setText("");
            }
        });

    }

}