/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author mauricio.moreira
 */
public class ExampleJRadioButton extends JFrame {
    
    JLabel TEXT1, TEXT2;
    JRadioButton BUTTONRAD1, BUTTONRAD2;
    JTextField INPUT;
    JButton BUTTON;
    
    public ExampleJRadioButton(String title) {
        super(title);
        Container CONTAINER = getContentPane();
        setSize(320, 250);
        setVisible(true);
        JFrame.setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        ButtonGroup GROUP = new ButtonGroup();
        TEXT1 = new JLabel("Entre com o seu nome: ");
        TEXT2 = new JLabel("Selecione o seu sexo: ");
        INPUT = new JTextField();
        BUTTON = new JButton("OK");
        BUTTONRAD1 = new JRadioButton("Masculino");
        BUTTONRAD2 = new JRadioButton("Feminino");
        
        GROUP.add(BUTTONRAD1);
        GROUP.add(BUTTONRAD2);
        
        CONTAINER.add(TEXT1);
        CONTAINER.add(TEXT2);
        CONTAINER.add(INPUT);
        CONTAINER.add(BUTTON);
        CONTAINER.add(BUTTONRAD1);
        CONTAINER.add(BUTTONRAD2);
        
        TEXT1.setBounds(30, 30, 140, 30);
        INPUT.setBounds(180, 30, 110, 30);
        TEXT2.setBounds(30, 60, 140, 30);
        BUTTONRAD1.setBounds(180, 60, 100, 30);
        BUTTONRAD2.setBounds(180, 90, 100, 30);
        BUTTON.setBounds(110, 120, 60, 30);
        
        ClickJRadioButton click = new ClickJRadioButton();
        BUTTON.addActionListener(click);
    }
    
    private class ClickJRadioButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String innerText;
            if (BUTTONRAD1.isSelected() == true) {
                innerText = "Boa noite, senhor " + INPUT.getText();
                JOptionPane.showMessageDialog(null, innerText, "GUI 1", 1);
            }
            if (BUTTONRAD2.isSelected() == true) {
                innerText = "Boa noite, senhorita " + INPUT.getText();
                JOptionPane.showMessageDialog(null, innerText, "GUI 2", 1);
            }
            INPUT.setText(" ");
            INPUT.requestFocus();
        }
    }
    
    public static void main(String[] args) {
        ExampleJRadioButton rb = new ExampleJRadioButton("Example JRadioButton");
    }
}
