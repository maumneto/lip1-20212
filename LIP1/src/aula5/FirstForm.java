/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author mauricio.moreira
 */
public class FirstForm extends JFrame {
    
    public FirstForm(String title){
        super(title);
        Container CONTAINER = getContentPane();
        setSize(400, 400);
        setVisible(true);
        setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        JLabel TEXT = new JLabel("Texto Exemplo!");
        
        CONTAINER.add(TEXT);
        
        TEXT.setBounds(20, 20, 180, 30);
    }
    
    public static void main(String[] args) {
        FirstForm form = new FirstForm("Primeiro Formulário"); 
    }
}
