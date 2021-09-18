/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5;

import java.awt.Frame;
import java.awt.Label;

/**
 *
 * @author mauricio.moreira
 */
public class HelloWorldWithAwt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Frame SCREEN = new Frame("Hello World!");
        Label TEXT = new Label("Bem-vindo a GUI com AWT.");
        
        SCREEN.setLayout(null);
        SCREEN.add(TEXT);
        TEXT.setBounds(50, 30, 240, 20);
        SCREEN.setSize(300, 200);
        SCREEN.setVisible(true);
    }
    
}
