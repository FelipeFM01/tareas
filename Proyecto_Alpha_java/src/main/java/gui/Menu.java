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
        this.add(this.MenuPanel);
        this.setSize(800,600);
        this.setLocationRelativeTo((Component)null);
        this.setDefaultCloseOperation(2);
        this.setTitle("Menu");

        final CrearPersonaje crearPersonaje = new CrearPersonaje("Registrar");
        this.crearPersonajeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                crearPersonaje.setVisible(true);
                Menu.this.dispose();
            }
        });
        this.SALIRButton.addActionListener(e -> System.exit(3));
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
