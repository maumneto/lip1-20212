/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author mauricio.moreira
 */
public class ExampleJOptionPane {
    public static void main(String[] args) {
        JFrame FRAME = new JFrame("Example JOptionPane");
        FRAME.setDefaultLookAndFeelDecorated(true);
        JDialog DIALOG = new JDialog();
        DIALOG.setDefaultLookAndFeelDecorated(true);
        FRAME.setSize(300, 300);
        FRAME.setVisible(true);
        FRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel TEXT = new JLabel("Click on the button!");
        JButton BUTTON = new JButton("enter");
        
        BUTTON.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String res = null;
                res = JOptionPane.showInputDialog(null, "Say your name:", "Input", 1);
                if (res != null) {
                    JOptionPane.showMessageDialog(null, "Hello Mr/Ms. " + res, "Hello Window", 1);
                } else {
                    JOptionPane.showMessageDialog(null, "Cancel was Clicked", "Fail", 1);
                }
            }
        });
        
        FRAME.setLayout(null);
        FRAME.getContentPane().add(TEXT);
        FRAME.getContentPane().add(BUTTON);
        
        TEXT.setBounds(40, 20, 200, 30);
        BUTTON.setBounds(40, 60, 100, 30);
    }
}
