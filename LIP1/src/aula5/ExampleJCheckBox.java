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
public class ExampleJCheckBox extends JFrame {
    // criando os elementos
    JLabel TEXT;
    JTextField TOTAL;
    JCheckBox ARCOND;
    JCheckBox DIRHID;
    JCheckBox PINMET;
    JCheckBox SISMID;
    JCheckBox CAUTO;
    JCheckBox CAM;
    
    long total = 0;
    long arcond_value = 2000;
    long dirhid_value = 1200;
    long pinmet_value = 800;
    long sismid_value = 2500;
    long cauto_value = 1800;
    long cam_value = 500;
    
    // construtor da classe ExampleJCheckBox
    public ExampleJCheckBox(String title) {
        super(title);
        Container CONTAINER = getContentPane();
        setSize(300, 350);
        setVisible(true);
        
        // instanciando os elementos que compõem a tela
        TEXT = new JLabel("Acessórios Disponíveis ");
        TOTAL = new JTextField();
        ARCOND = new JCheckBox("Ar Condicionado");
        DIRHID = new JCheckBox("Direção Hidráulica");
        PINMET = new JCheckBox("Pintura Metálica");
        SISMID = new JCheckBox("Sistema de Mídia");
        CAUTO = new JCheckBox("Câmbio Automático");
        CAM = new JCheckBox("Câmera de Ré");
        // ajustando todos como vazios/falso
        ARCOND.setSelected(false);
        DIRHID.setSelected(false);
        PINMET.setSelected(false);
        SISMID.setSelected(false);
        CAUTO.setSelected(false);
        CAM.setSelected(false);
        
        setLayout(null);
        // adicionar os elementos ao frame/tela
        CONTAINER.add(TEXT);
        CONTAINER.add(TOTAL);
        CONTAINER.add(ARCOND);
        CONTAINER.add(DIRHID);
        CONTAINER.add(PINMET);
        CONTAINER.add(SISMID);
        CONTAINER.add(CAUTO);
        CONTAINER.add(CAM);
        
        TOTAL.setHorizontalAlignment(JTextField.CENTER);
        
        // Ajustar as posições dos elementos
        TEXT.setBounds(20, 20, 180, 30);
        ARCOND.setBounds(20, 60, 150, 30);
        DIRHID.setBounds(20, 90, 150, 30);
        PINMET.setBounds(20, 120, 150, 30);
        SISMID.setBounds(20, 150, 150, 30);
        CAUTO.setBounds(20, 180, 150, 30);
        CAM.setBounds(20, 210, 150, 30);
        TOTAL.setBounds(20, 260, 160, 30);
        
        // associar cada botão a uma ação
        ARCOND.addActionListener(new ArCondicionado());
        DIRHID.addActionListener(new DirHidraulica());
        PINMET.addActionListener(new PinMetalica());
        SISMID.addActionListener(new SisMidia());
        CAUTO.addActionListener(new CamAuto());
        CAM.addActionListener(new CamRe());
        
        TOTAL.setText(String.valueOf(total));
    }
    private class ArCondicionado implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            total = Long.parseLong(TOTAL.getText());
            if (ARCOND.isSelected()) {
                total += arcond_value;
            } else {
                total -= arcond_value;
            }
            TOTAL.setText(String.valueOf(total));
        }
    }
    private class DirHidraulica implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            total = Long.parseLong(TOTAL.getText());
            if (DIRHID.isSelected()) {
                total += dirhid_value;
            } else {
                total -= dirhid_value;
            }
            TOTAL.setText(String.valueOf(total));

        }
    }
    private class PinMetalica implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            total = Long.parseLong(TOTAL.getText());
            if (PINMET.isSelected()) {
                total += pinmet_value;
            } else {
                total -= pinmet_value;
            }
            TOTAL.setText(String.valueOf(total));
        }
    }
     
    private class SisMidia implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            total = Long.parseLong(TOTAL.getText());
            if (SISMID.isSelected()) {
                total += sismid_value;
            } else {
                total -= sismid_value;
            }
            TOTAL.setText(String.valueOf(total));
        }
    }
    
    private class CamAuto implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            total = Long.parseLong(TOTAL.getText());
            if (CAUTO.isSelected()) {
                total += cam_value;
            } else {
                total -= cam_value;
            }
            TOTAL.setText(String.valueOf(total));
        }
    }
    
    private class CamRe implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            total = Long.parseLong(TOTAL.getText());
            if (CAM.isSelected()) {
                total += cam_value;
            } else {
                total -= cam_value;
            }
            TOTAL.setText(String.valueOf(total));
        }
    }
    
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        ExampleJCheckBox check = new ExampleJCheckBox("Example JCheck");
        check.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
