/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5;

import java.awt.Color;
import java.awt.Container;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import java.awt.event.*;


/**
 *
 * @author mauricio.moreira
 */
public class ExampleJTextArea extends JFrame {
    // creating the elements
    JButton BUTTON, ERASEBUTTON;
    JTextArea TEXTAREA, TEXTRESULT;
    
    public ExampleJTextArea(String title) {
        super(title);
        Container CONTAINER = getContentPane();
        // creating a variable to put a border in the elements
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        // instaces of the elements
        BUTTON = new JButton("Click");
        ERASEBUTTON = new JButton("Erase");
        TEXTRESULT = new JTextArea("Result: ");
        TEXTAREA = new JTextArea("Enter with your text!");
        
        setLayout(null);
        // puttin the borders in the text areas (JTextArea's)
        TEXTAREA.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10,10,10,10)));
        TEXTRESULT.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10,10,10,10)));
        // add elements in the frame
        CONTAINER.add(TEXTAREA);
        CONTAINER.add(BUTTON);
        CONTAINER.add(ERASEBUTTON);
        CONTAINER.add(TEXTRESULT);        
        // adjusting the positions of the elements
        TEXTAREA.setBounds(10, 20, 200, 200);
        BUTTON.setBounds(10, 230, 100, 30);
        ERASEBUTTON.setBounds(120, 230, 100, 30);
        TEXTRESULT.setBounds(220, 20, 200, 200);
        // setting the frame
        setSize(450, 300);
        setVisible(true);
        // connecting the button with action
        ButtonEvent event = new ButtonEvent();
        BUTTON.addActionListener(event);
        EraseEvent erase = new EraseEvent();
        ERASEBUTTON.addActionListener(erase);
    }
    /**
     * inner classes: button and erase-button
     */
    private class ButtonEvent implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String text = TEXTAREA.getText();
            TEXTRESULT.setText(text);
            
            TEXTAREA.requestFocus();
        }
    }
    private class EraseEvent implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            TEXTRESULT.setText("");
            
            TEXTAREA.requestFocus();
        }
    }
    /**
     * main class
     */
    public static void main(String[] args) throws Exception {
        JFrame.setDefaultLookAndFeelDecorated(true);
        ExampleJTextArea example = new ExampleJTextArea("Example JTextArea");
        example.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
