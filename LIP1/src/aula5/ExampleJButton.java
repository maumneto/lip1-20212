/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5;

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
public class ExampleJButton extends JFrame {

    JButton BUTTON;
    JTextField TEXTFIELD;
    JLabel TEXTOUTPUT;
    JLabel TEXTCHANGE;
    
    public ExampleJButton() {
        super("Exemplo JButton");
        Container CONTAINER = getContentPane();
        BUTTON = new JButton("Clique");
        TEXTOUTPUT = new JLabel("Entre com o seu nome: ");
        TEXTFIELD = new JTextField();
        TEXTCHANGE = new JLabel("");
        setSize(350, 250);
        setVisible(true);
        
        setLayout(null);
        
        CONTAINER.add(BUTTON);
        CONTAINER.add(TEXTOUTPUT);
        CONTAINER.add(TEXTFIELD);
        CONTAINER.add(TEXTCHANGE);
        
        TEXTOUTPUT.setBounds(50, 20, 200, 30);
        TEXTFIELD.setBounds(50, 60, 200, 30);
        BUTTON.setBounds(50, 90, 100, 30);
        TEXTCHANGE.setBounds(50, 120, 200, 30);
        
        EventButton event = new EventButton();
        BUTTON.addActionListener(event);
        

    }
    
    private class EventButton implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String rotulo = TEXTFIELD.getText();
            TEXTCHANGE.setText(rotulo);
        }
    }
    
    public static void main(String[] args) {
//        JFrame.setDefaultLookAndFeelDecorated(true);
        ExampleJButton exemplo = new ExampleJButton();
        exemplo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
