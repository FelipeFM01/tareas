package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener{
    private JButton crearPersonajeButton;
    private JButton verPersonajesCreadosButton;
    private JButton SALIRButton;
    private JPanel MenuPanel;

    public Menu() {
        add(this.MenuPanel);
        setSize(800,600);
        setLocationRelativeTo((Component)null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Menu");
        final CrearPersonaje crearPersonaje = new CrearPersonaje("Crear");
        crearPersonajeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            crearPersonaje.setVisible(true);
            }
        });



        this.SALIRButton.addActionListener(e -> System.exit(3));

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
