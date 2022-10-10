package Gui_vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu_Intranet extends JFrame implements ActionListener{

    private JPanel PanelMenuIntranet;
    private JButton registrarCarreraButton;
    private JButton registrarEstudianteButton;
    private JButton buscarEstudianteButton;
    private JButton salirButton;



    public Menu_Intranet(){
        add(PanelMenuIntranet);
        setSize(800,600);
        setLocationRelativeTo(null);   //  en la mitad de la pantalla
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);// cuando aprete "X" salga del programa
        setTitle("Menu Intranet");

        final RegistrarCarrera registrarCarrera = new RegistrarCarrera(); // comunicar esta clase con la de registro carrera
        //ahora hacemos que una vez entrelazada APAREZCA la ventana de registro carrera
        registrarCarreraButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                registrarCarrera.setVisible(true);
                dispose();
            }
        });

        final RegistrarEstudiante registrarEstudiante = new RegistrarEstudiante("Registrar"); // comunicar esta clase con la de registro estudiante
        //ahora hacemos que una vez entrelazada APAREZCA la ventana de registro estudiante
        registrarEstudianteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                registrarEstudiante.setVisible(true);
                dispose();


            }
        });




        final BuscarEstudiante buscarEstudiante = new BuscarEstudiante(); // comunicar esta clase con la de buscar estudiante
        //ahora hacemos que una vez entrelazada APAREZCA la ventana de buscar estudiante
        buscarEstudianteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                buscarEstudiante.setVisible(true);
                dispose();
            }
        });


        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(3);
            }
        });

    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
