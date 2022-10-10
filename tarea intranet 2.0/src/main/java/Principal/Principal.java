package Principal;

import Gui_vista.Menu_Intranet;
import Gui_vista.RegistrarEstudiante;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal extends JFrame{


    public static void main(String[] args){

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Menu_Intranet registrarCarrera = new Menu_Intranet() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                    }
                };
                registrarCarrera.setVisible(true);
            }

        });







    }


}
