package gui;

import controller.PersonajeController;
import model.VentanaTabla;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CrearPersonaje extends JFrame implements ActionListener {
    private boolean visible;
    private JTextField nombreDeTuPersonajeTextField;
    private JComboBox RAZAcomboBox;
    private JComboBox SubRazacomboBox;
    private JComboBox Equip1comboBox;
    private JComboBox Equip2comboBox;
    private JButton regresarAMenuButton;
    private JPanel CrearPersonajesPanel;
    private JButton guardarButton;
    private JTextField edadtext;
    private JTextField comptext;
    private JTextField idiomastext;
    private JButton verPersonajesCreadosButton;
    private JComboBox ClasecomboBox;


    public CrearPersonaje(String registrar) {
        this.add(this.CrearPersonajesPanel);
        this.setSize(700, 500);
        this.setLocationRelativeTo((Component)null);
        this.setDefaultCloseOperation(2);
        final DefaultComboBoxModel RazacomboBoxModel = new DefaultComboBoxModel();
        this.RAZAcomboBox.setModel(RazacomboBoxModel);
        RazacomboBoxModel.addElement("Raza 1");
        RazacomboBoxModel.addElement("Raza 2");
        RazacomboBoxModel.addElement("Raza 3");
        RazacomboBoxModel.addElement("Raza 4");
        RazacomboBoxModel.addElement("Raza 5");
        RazacomboBoxModel.addElement("Raza 6");
        RazacomboBoxModel.addElement("Raza 7");

        final DefaultComboBoxModel SubRazacomboBoxModel = new DefaultComboBoxModel();
        this.SubRazacomboBox.setModel(SubRazacomboBoxModel);
        SubRazacomboBoxModel.addElement("Raza 11");
        SubRazacomboBoxModel.addElement("Raza 21");
        SubRazacomboBoxModel.addElement("Raza 22");
        SubRazacomboBoxModel.addElement("Raza 31");
        SubRazacomboBoxModel.addElement("Raza 32");
        SubRazacomboBoxModel.addElement("Raza 33");
        SubRazacomboBoxModel.addElement("Raza 41");
        SubRazacomboBoxModel.addElement("Raza 51");
        SubRazacomboBoxModel.addElement("Raza 61");
        SubRazacomboBoxModel.addElement("Raza 62");
        SubRazacomboBoxModel.addElement("Raza 71");
        SubRazacomboBoxModel.addElement("Raza 72");

        final DefaultComboBoxModel Equip1comboBoxModel = new DefaultComboBoxModel();
        this.Equip1comboBox.setModel(Equip1comboBoxModel);
        Equip1comboBoxModel.addElement("equipamiento 1");
        Equip1comboBoxModel.addElement("equipamiento 2");
        Equip1comboBoxModel.addElement("equipamiento 3");
        Equip1comboBoxModel.addElement("equipamiento 4");
        Equip1comboBoxModel.addElement("equipamiento 5");
        Equip1comboBoxModel.addElement("equipamiento 6");
        Equip1comboBoxModel.addElement("equipamiento 7");
        Equip1comboBoxModel.addElement("equipamiento 8");
        Equip1comboBoxModel.addElement("equipamiento 9");
        Equip1comboBoxModel.addElement("equipamiento 10");
        Equip1comboBoxModel.addElement("equipamiento 11");
        Equip1comboBoxModel.addElement("equipamiento 12");

        final DefaultComboBoxModel Equip2comboBoxModel = new DefaultComboBoxModel();
        this.Equip2comboBox.setModel(Equip2comboBoxModel);
        Equip2comboBoxModel.addElement("equipamiento 1");
        Equip2comboBoxModel.addElement("equipamiento 2");
        Equip2comboBoxModel.addElement("equipamiento 3");
        Equip2comboBoxModel.addElement("equipamiento 4");
        Equip2comboBoxModel.addElement("equipamiento 5");
        Equip2comboBoxModel.addElement("equipamiento 6");
        Equip2comboBoxModel.addElement("equipamiento 7");
        Equip2comboBoxModel.addElement("equipamiento 8");
        Equip2comboBoxModel.addElement("equipamiento 9");
        Equip2comboBoxModel.addElement("equipamiento 10");
        Equip2comboBoxModel.addElement("equipamiento 11");
        Equip2comboBoxModel.addElement("equipamiento 12");

    }


    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public boolean isVisible() {
        return visible;
    }




    private String[][] exportarDatos() throws ClassNotFoundException {
        if (this.nombreDeTuPersonajeTextField.getText().length() == 0 && this.RAZAcomboBox.getSelectedItem().equals("vacio") && this.ClasecomboBox.getSelectedItem().equals("vacio")){
            JOptionPane.showMessageDialog(this, "Ingrese datos validos");
            return new String[0][0];
        } else{
            return this.nombreDeTuPersonajeTextField.getText().length() == 0 ? PersonajeController.mostrarPersonajePorRaza(this.RAZAcomboBox.getSelectedItem().toString()) : PersonajeController.mostrarPersonajePorClase(this.ClasecomboBox.getSelectedItem().toString()) ;
        }
    }

    public void actionPerformed() {
        actionPerformed(null);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.verPersonajesCreadosButton) {
            String[] nombreColumnas = new String[]{"Nombre", "Raza", "Clase"};

            try {
                new VentanaTabla(this.exportarDatos(), nombreColumnas);
            } catch (ClassNotFoundException var4) {
                var4.printStackTrace();
            }
        }

        if (e.getSource() == this.regresarAMenuButton) {
            new Menu();
            this.dispose();
        }

    }




}
