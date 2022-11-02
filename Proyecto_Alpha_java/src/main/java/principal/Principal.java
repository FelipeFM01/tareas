package principal;

import gui.Menu;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Principal {
    public Principal() {
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Menu menu = new Menu() {
                    public void actionPerformed(ActionEvent e) {
                    }
                };
                menu.setVisible(true);
            }
        });
    }
}
