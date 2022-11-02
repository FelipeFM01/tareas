package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CrearPersonaje extends JFrame implements ActionListener {
    private boolean visible;
    private JTextField nombreDeTuPersonajeTextField;
    private JComboBox<String> RAZAcomboBox;
    private JComboBox<String> SubRazacomboBox;
    private JPanel CrearPersonajesPanel;
    private JButton guardarButton;
    private JTextField edadtext;
    private JComboBox ClasecomboBox;


    public CrearPersonaje(String Crear) {
        this.add(this.CrearPersonajesPanel);
        this.setSize(1000, 800);
        this.setLocationRelativeTo((Component)null);
        this.setDefaultCloseOperation(2);
        final DefaultComboBoxModel<String> RazacomboBoxModel = new DefaultComboBoxModel<>();
        this.RAZAcomboBox.setModel(RazacomboBoxModel);
        RazacomboBoxModel.addElement("Raza 1");
        RazacomboBoxModel.addElement("Raza 2");
        RazacomboBoxModel.addElement("Raza 3");
        RazacomboBoxModel.addElement("Raza 4");
        RazacomboBoxModel.addElement("Raza 5");
        RazacomboBoxModel.addElement("Raza 6");
        RazacomboBoxModel.addElement("Raza 7");

        final DefaultComboBoxModel<String> SubRazacomboBoxModel = new DefaultComboBoxModel<>();
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

        final DefaultComboBoxModel<String> ClasecomboBoxModel = new DefaultComboBoxModel<>();
        this.ClasecomboBox.setModel(ClasecomboBoxModel);
        ClasecomboBoxModel.addElement("Guerrero");
        ClasecomboBoxModel.addElement("Paladin");
        ClasecomboBoxModel.addElement("Picaro");
        ClasecomboBoxModel.addElement("Cazador");
        ClasecomboBoxModel.addElement("Bárbaro");
        ClasecomboBoxModel.addElement("Bardo");
        ClasecomboBoxModel.addElement("Brujo");
        ClasecomboBoxModel.addElement("Clérigo");
        ClasecomboBoxModel.addElement("Druida");
        ClasecomboBoxModel.addElement("Hechicero");
        ClasecomboBoxModel.addElement("Mago");
        ClasecomboBoxModel.addElement("Explorador");
        ClasecomboBoxModel.addElement("Monje");




        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Nombre = nombreDeTuPersonajeTextField.getText();
                String Edad = edadtext.getText();
                System.out.println("A registrado a " + Nombre + "" + " con Exito!!!!!");   // mensaje por consola

                String RAZAcomboBox = RazacomboBoxModel.getSelectedItem().toString();
                String SubRAZAcomboBox = SubRazacomboBoxModel.getSelectedItem().toString();
                String ClasecomboBox = ClasecomboBoxModel.getSelectedItem().toString();

                JOptionPane.showMessageDialog(null, "A registrado a " + Nombre + "un" + RAZAcomboBox + "desafortunado que gracias a los cielos y a su propia suerte tuvo la suerte de acabar como " + ClasecomboBox + " para vivir aventuras y sobrevivir a las adversidades que aloja esta tierra, y con solo " + Edad + " nada mal!!! ", null, JOptionPane.INFORMATION_MESSAGE);
                // mensaje que se muestra una vez ingresado los datos
            }
        });
    }






    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public boolean isVisible() {
        return visible;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
