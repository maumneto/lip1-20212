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
public class ExampleJCheckBox extends javax.swing.JFrame {
    
    JLabel TEXT;
    JTextField TOTAL;
    JCheckBox ARCOND;
    JCheckBox DIRHID;
    JCheckBox PINMET;
    JCheckBox SISMID;
    JCheckBox CAUTO;
    JCheckBox CAM;
    
    public ExampleJCheckBox(String title) {
        super(title);
        Container CONTAINER = getContentPane();
        setSize(200, 400);
        setVisible(true);
        JFrame.setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        TEXT = new JLabel("Acessórios Disponíveis: ");
        TOTAL = new JTextField();
        
        ARCOND = new JCheckBox("Ar Condicionado");
        DIRHID = new JCheckBox("Direção Hidráulica");
        PINMET = new JCheckBox("Pintura Metálica");
        SISMID = new JCheckBox("Sistema de Mídia");
        CAUTO = new JCheckBox("Câmbio Automático");
        CAM = new JCheckBox("Câmera de Ré");
        
        
    }
    
    public static void main(String[] args) {
        
    }
}
