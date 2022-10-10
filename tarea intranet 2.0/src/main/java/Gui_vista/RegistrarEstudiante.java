package Gui_vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrarEstudiante extends JFrame{

    private JPanel PanelRegistarEstudiantes;
    private JTextField txtFieldnombre;
    private JTextField txtFieldrut;
    private JTextField txtFieldmatricula;
    private JComboBox comboBoxCarrera;
    private JButton regresarMenuButton;
    private JButton registrarEstudianteButton;




    public RegistrarEstudiante(String registrar) {


        add(PanelRegistarEstudiantes);
        setSize(700,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);


        DefaultComboBoxModel comboBoxCarreraModel = new DefaultComboBoxModel();
        comboBoxCarrera.setModel(comboBoxCarreraModel);
        comboBoxCarreraModel.addElement("ICI-I");
        comboBoxCarreraModel.addElement("ICI-B");
        comboBoxCarreraModel.addElement("ICI-M");
        comboBoxCarreraModel.addElement("Ingenieria Civil Industrial");
        comboBoxCarreraModel.addElement("Ingenieria Civil");
        comboBoxCarreraModel.addElement("Ingenieria Civil Ambiental");
        comboBoxCarreraModel.addElement("Ingenieria Civil Biotecnología");
        comboBoxCarreraModel.addElement("Ingenieria Civil Electrica");
        comboBoxCarreraModel.addElement("Ingenieria Civil Electronica");
        comboBoxCarreraModel.addElement("Ingenieria Civil Fisica");
        comboBoxCarreraModel.addElement("Ingenieria Civil Quimica");
        comboBoxCarreraModel.addElement("Ingenieria Civil Informatica");
        comboBoxCarreraModel.addElement("Ingenieria Civil Telematica");
        comboBoxCarreraModel.addElement("Ingenieria Civil Matematica");
        comboBoxCarreraModel.addElement("Ingenieria Civil Mecanica");
        comboBoxCarreraModel.addElement("Ingenieria Informatica");
        comboBoxCarreraModel.addElement("Ingenieria en Construccion");
        comboBoxCarreraModel.addElement("Plan Comun Ingenieria Civil");

        registrarEstudianteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Nombre = txtFieldnombre.getText();
                String Rut = txtFieldrut.getText();
                String Matricula = txtFieldmatricula.getText();
                System.out.println("A registrado a " + Nombre + "" + " con Exito!!!!!");

                String comboBoxCarrera = comboBoxCarreraModel.getSelectedItem().toString();// metodo para el comboBoc de las carreras

                JOptionPane.showMessageDialog(null, "A registrado a " + Nombre + " en la carrera " + comboBoxCarrera + " con Exito!!!!!", null, JOptionPane.INFORMATION_MESSAGE);



            }
        });


        regresarMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtFieldnombre.setText("");
                txtFieldrut.setText("");
                txtFieldmatricula.setText("");
            }
        });
    }





}
