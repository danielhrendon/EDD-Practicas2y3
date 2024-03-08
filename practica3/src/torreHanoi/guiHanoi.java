/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torreHanoi;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import static java.lang.ProcessBuilder.Redirect.from;
import javax.swing.JFrame;
import javax.swing.*;

/**
 *
 * @author danie
 */
public class guiHanoi extends JFrame{
    JLabel lblTitulo, lblTitulo1, lblNumero;
    JTextField txtNumero;
    JButton btnComenzar, btnLimpiar, btnSalir;
    
    public guiHanoi(){
        setTitle("Practica 3 - Torre de Hanoi");
        
        setLayout(null);
        setSize(1200,720);
        Interfaz();
        
        this.setResizable(false);
    }
    
    public void Interfaz(){
        lblTitulo = new JLabel ("T O R R E");
        lblTitulo.setBounds(500, 10, 400, 80);
        lblTitulo.setFont(new java.awt.Font("Aptos", 1, 50));
        lblTitulo.setForeground(new java.awt.Color(200, 0, 0));
        
        lblTitulo1 = new JLabel ("D E  H A N O I");
        lblTitulo1.setBounds(450, 55, 400, 80);
        lblTitulo1.setFont(new java.awt.Font("Aptos", 1, 50));
        lblTitulo1.setForeground(new java.awt.Color(200, 0, 0));
        
        lblNumero = new JLabel ("N U M E R O: ");
        lblNumero.setBounds(280, 150, 400, 80);
        lblNumero.setFont(new java.awt.Font("Aptos", 1, 14));
        lblNumero.setForeground(new java.awt.Color(0, 0, 0));
        
        txtNumero = new JTextField();
        txtNumero.setBounds(400, 180, 400, 30);
        txtNumero.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent evt) {
                char c = evt.getKeyChar();
                if (c <'1'|| c >'8')evt.consume();{
                }
                if(txtNumero.getText().length()>0){
                    evt.consume();
                    JOptionPane.showMessageDialog(null, "NO INGRESES MAS DE UN NUMEROS!");
                }
            }
         });
        JTextArea areaTexto = new JTextArea();
        areaTexto.setEnabled(false);    
        JScrollPane scroll = new JScrollPane(areaTexto);
        scroll.setBounds(400, 300, 500, 350);
        btnComenzar = new JButton("COMENZAR");
        btnComenzar.setBounds(500,250, 100, 30);
        btnComenzar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
                if (txtNumero.getText().trim().length() == 0){
                    JOptionPane.showMessageDialog(null, "INGRESA UN NUMERO");
                    System.exit(0);
                }
                try {
                    int nDiscos = Integer.parseInt(txtNumero.getText());
                    if (nDiscos  < 1 || nDiscos > 8) {
                        JOptionPane.showMessageDialog(null, "Por favor, ingresa un número entre 1 y 8.");
                        return;
                    }
                    lgHanoi lg = new lgHanoi();
                    lg.moveDisks(nDiscos, 'A', 'C', 'D', areaTexto);
                    txtNumero.setText("");
                       
                } catch (NumberFormatException ex) { 
                    areaTexto.setText("");
                    areaTexto.append("INGRESA UN NUMERO VALIDO.\n");
                }
            }    
        });   
        btnLimpiar = new JButton("LIMPIAR");
        btnLimpiar.setBounds(700,250, 100, 30);
        btnLimpiar.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent ev2){
                txtNumero.setText("");
                areaTexto.setText("");
            }
        });
        btnSalir = new JButton("SALIR");
        btnSalir.setBounds(1000,500, 100, 50);
        btnSalir.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ev3){
                    System.exit(0);
                }
        });
        
        add(btnLimpiar);
        add(lblTitulo);
        add(lblTitulo1);
        add(lblNumero);
        add(txtNumero);
        add(btnComenzar);
        add(btnSalir);
        add(scroll);
        
        
    }
    
}
