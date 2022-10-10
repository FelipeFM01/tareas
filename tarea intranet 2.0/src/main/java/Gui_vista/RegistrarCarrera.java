package Gui_vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrarCarrera extends JFrame{
    private JPanel PanelRegistrarCarrera;
    private JTextField textFieldnombreCarrera;
    private JTextField textFieldcodCarrera;
    private JTextField textFieldcantSemestres;
    private JButton limpiarCamposButton;
    private JButton registrarCarreraButton;
    private JButton volverAMenuButton;

    public RegistrarCarrera(){

        add(PanelRegistrarCarrera);
        setSize(700,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);




        limpiarCamposButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFieldnombreCarrera.setText("");
                textFieldcodCarrera.setText("");
                textFieldcantSemestres.setText("");
            }
        });
        registrarCarreraButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String NombreCarrera = textFieldnombreCarrera.getText();
                String CodCarrera = textFieldcodCarrera.getText();
                String CantSemestres = textFieldcantSemestres.getText();
                System.out.println(" La carrera registrada " + NombreCarrera + " cuenta con una duracion de " + CantSemestres + "");

                JOptionPane.showMessageDialog(null, " La carrera registrada " + NombreCarrera + " cuenta con una duracion de " + CantSemestres + " semestres ", null, JOptionPane.INFORMATION_MESSAGE);

            }
        });



    }





}
