/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author mauricio.moreira
 */
public class ExampleJTextArea0 extends JFrame{
    JTextArea TEXTAREA;
    
    public ExampleJTextArea0(String title) {
        super(title);
        Container CONTAINER = getContentPane();
        setLayout(null);
        setSize(300, 300);
        setVisible(true);
        
        TEXTAREA = new JTextArea("Entre com qualquer palavra");
        
        CONTAINER.add(TEXTAREA);
        
        TEXTAREA.setBounds(10, 10, 200, 200);
    }
    
    public static void main(String[] args) {
        setDefaultLookAndFeelDecorated(true);
        ExampleJTextArea0 example = new ExampleJTextArea0("Exemplo de TextArea");
        example.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
