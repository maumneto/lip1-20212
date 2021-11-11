/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provaNP2;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author mauricio.moreira
 */
public class questao8 extends JFrame {
    JButton BUTTON;
    JTextField ENTRY;
    JLabel OUTPUT, PRESENTATION;
    public questao8() {
        super("Questão 8");
        
        BUTTON = new JButton("Click");
        ENTRY = new JTextField();
        OUTPUT = new JLabel("");
        PRESENTATION = new JLabel("Entre com o conteúdo: ");
        
        setLayout(null);
        setVisible(true);
        setSize(400,400);
        Container CONT = getContentPane();
        
        CONT.add(BUTTON);
        CONT.add(ENTRY);
        CONT.add(OUTPUT);
        CONT.add(PRESENTATION);
        
        PRESENTATION.setBounds(40, 20, 200, 30);
        ENTRY.setBounds(40, 60, 200, 30);
        BUTTON.setBounds(40, 100, 200, 30);
        OUTPUT.setBounds(40, 140, 200, 30);
        
        ButtonClicked click = new ButtonClicked();
        BUTTON.addActionListener(click);
        
    } 
    
        private class ButtonClicked implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                String content = ENTRY.getText();
                OUTPUT.setText(content);
            }
    }
    
    public static void main(String[] args) {
        questao8 q = new questao8();
        q.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
