/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

/**
 *
 * @author mauricio.moreira
 */
public class ExampleJPasswordField extends JFrame {
    // creating the elements used in the example
    JLabel TEXTAREA1, TEXTAREA2, TEXTAREA3;
    JTextField LOGIN;
    JPasswordField PASSWORD;
    JButton ENTER;
    
    public ExampleJPasswordField(String title) {
        super(title);
        Container CONTAINER = getContentPane();
        // instances of elements
        TEXTAREA1 = new JLabel("Please, Enter with your Data");
        TEXTAREA2 = new JLabel("Login: ");
        TEXTAREA3 = new JLabel("Password: ");
        LOGIN = new JTextField();
        PASSWORD = new JPasswordField();
        ENTER = new JButton("Enter");
        
        setLayout(null);
        // add the elements in the frame
        CONTAINER.add(TEXTAREA1);
        CONTAINER.add(TEXTAREA2);
        CONTAINER.add(TEXTAREA3);
        CONTAINER.add(LOGIN);
        CONTAINER.add(PASSWORD);
        CONTAINER.add(ENTER);
        // setting the positions of the elements
        TEXTAREA1.setBounds(20, 20, 190, 30);
        TEXTAREA2.setBounds(20, 50, 90, 30);
        LOGIN.setBounds(90, 50, 110, 30);
        TEXTAREA3.setBounds(20, 90, 90, 30);
        PASSWORD.setBounds(90, 90, 110, 30);
        ENTER.setBounds(70, 130, 90, 30);
        // instance the inner class and link an event with the button 
        Event EVENT = new Event();
        ENTER.addActionListener(EVENT);
        // setting the frame
        setSize(300, 250);
        setVisible(true);
    }
    private class Event implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
          String login = LOGIN.getText();
          String pass = new String(PASSWORD.getPassword());
          if (login.equals("maumneto") && pass.equals("mau123")) {
            JOptionPane.showMessageDialog(null, "Login Successfully", "Success", 1);
          } else {
            JOptionPane.showMessageDialog(null, "Login or Password Wrong", "Error", 1);
          }
        }
    }
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        ExampleJPasswordField passfield = new ExampleJPasswordField("Example of JPasswordField");
        passfield.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
