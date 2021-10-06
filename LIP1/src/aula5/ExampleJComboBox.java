/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author mauricio.moreira
 */
public class ExampleJComboBox extends JFrame {
    JLabel TEXT_NAME, TEXT_AGE, TEXT_COUNTRY;
    JTextField NAME, AGE;
    JButton SELECT;
    final JComboBox COUNTRIES;
    String countries[] = {"Brazil", "USA", "England", "Chile", "Argentina"};
    
    public ExampleJComboBox(String title) {
        super(title);
        Container CONTAINER = getContentPane();
        // instances of elements 
        TEXT_NAME = new JLabel("Nome: ");
        TEXT_AGE = new JLabel("Idade: ");
        TEXT_COUNTRY = new JLabel("País: ");
        NAME = new JTextField();
        AGE = new JTextField();
        SELECT = new JButton("OK");
        COUNTRIES = new JComboBox(countries);

        setLayout(null);
        // add elements in the frame
        CONTAINER.add(TEXT_NAME);
        CONTAINER.add(TEXT_AGE);
        CONTAINER.add(TEXT_COUNTRY);
        CONTAINER.add(NAME);
        CONTAINER.add(AGE);
        CONTAINER.add(SELECT);
        CONTAINER.add(COUNTRIES);
        // adjusting the positions of the elements in the frame
        TEXT_NAME.setBounds(20, 20, 90, 30);
        NAME.setBounds(90, 20, 140, 30);
        TEXT_AGE.setBounds(20, 60, 90, 30);
        AGE.setBounds(90, 60, 140, 30);
        TEXT_COUNTRY.setBounds(20, 110, 110, 30);
        COUNTRIES.setBounds(90, 110, 140, 30);
        SELECT.setBounds(20, 160, 60, 20);
        // instance the inner class and link an event with the button
        EventCombo EVENT = new EventCombo();
        SELECT.addActionListener(EVENT);
        // setting the frame
        setSize(300, 300);
        setVisible(true);
        this.setLocationRelativeTo(null);
    }
    /**
     * Inner class (implements an action)
     */
    private class EventCombo implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFrame.setDefaultLookAndFeelDecorated(true);

            String name = NAME.getText();
            String age = AGE.getText();
            String country = COUNTRIES.getSelectedItem().toString();
            JFrame frame = new JFrame("Dados do Usuário");
            JLabel nome = new JLabel("Nome: " + name);
            JLabel idade = new JLabel("Idade: " + age);
            JLabel pais = new JLabel("Pais: " + country);

            frame.setLayout(null);

            frame.add(nome);
            frame.add(idade);
            frame.add(pais);

            nome.setBounds(20, 20, 150, 30);
            idade.setBounds(20, 50, 150, 30);
            pais.setBounds(20, 80, 150, 30);

            frame.setSize(250, 200);
            frame.setVisible(true);
        }
    }
    /**
     * main class
     * @param args
     */
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        ExampleJComboBox combobox = new ExampleJComboBox("Example JComboBox");
        combobox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
