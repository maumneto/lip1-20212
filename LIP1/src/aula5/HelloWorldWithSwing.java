/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author mauricio.moreira
 */
public class HelloWorldWithSwing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true); // vai deixar a tela bonitinha.
        JFrame SCREEN = new JFrame("Hello World!");
        JLabel TEXT = new JLabel("Minha primeira GUI com Swing!");

        SCREEN.setLayout(null);
        SCREEN.getContentPane().add(TEXT);

        TEXT.setBounds(30, 30, 240, 20);
        SCREEN.setSize(300, 200);
        SCREEN.setVisible(true);
        SCREEN.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
