/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serieFibonacci;


import java.awt.Color;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;
import static javafx.beans.binding.Bindings.length;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author danie
 */
public class guiFibonacci extends JFrame{
    JLabel lbltitulo, lbltitulo1, lbllongitud;
    JButton btnSiguiente, btnLimpiar, btnSalir;
    JTextField txtlongitud;  
    public guiFibonacci(){
        setTitle("Practica 2 - Serie Fibonacci");
        setLayout(null);
        setSize(1200,720);
        Interfaz();
        this.setResizable(false);
    }
    public void Interfaz(){
        lbltitulo = new JLabel ("S E R I E");
        lbltitulo.setBounds(500, 10, 400, 80);
        lbltitulo.setFont(new java.awt.Font("Arial", 1, 50));
        lbltitulo.setForeground(new java.awt.Color(0, 0, 0));
        
        lbltitulo1 = new JLabel ("F I B O N A C C I");
        lbltitulo1.setBounds(420, 55, 400, 80);
        lbltitulo1.setFont(new java.awt.Font("Arial", 1, 50));
        lbltitulo1.setForeground(new java.awt.Color(0, 0, 0));
        
        lbllongitud = new JLabel ("LONGITUD DE SERIE FIBONACCI: ");
        lbllongitud.setBounds(210, 150, 400, 80);
        lbllongitud.setFont(new java.awt.Font("Arial", 1, 14));
        lbllongitud.setForeground(new java.awt.Color(0, 0, 0));
        
        txtlongitud = new JTextField();
        txtlongitud.setBounds(460, 180, 400, 30);
        txtlongitud.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent evt){
                char c = evt.getKeyChar();
                if (c <'0'|| c >'9')evt.consume();{
                
                }
                if(txtlongitud.getText().length()>1 ){
                    evt.consume();
                    JOptionPane.showMessageDialog(null, "NO INGRESES MAS DE DOS NUMEROS!");
                }
                else {
                    String valida = txtlongitud.getText() + c;
                    if (!valida.isEmpty()) {
                        int b = Integer.parseInt(valida);
                        if (b < 1 || b > 40) {
                            evt.consume();
                            JOptionPane.showMessageDialog(null, "ESCRIBE UN NUMERO ENTRE EL 1 Y EL 40");
                        }
                    }
                }
                
            }   
         });
        JTextArea areaTexto = new JTextArea();
        areaTexto.setEnabled(false);    
        JScrollPane scroll = new JScrollPane(areaTexto);
        scroll.setBounds(400, 300, 500, 350);
        btnSiguiente = new JButton("SIGUIENTE");
        btnSiguiente.setBounds(500,250, 100, 30);
        btnSiguiente.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
                if (txtlongitud.getText().trim().length() == 0){
                    JOptionPane.showMessageDialog(null, "INGRESA UN NUMERO");
                    System.exit(0);
                }
                try {
                    int n = Integer.parseInt(txtlongitud.getText());
                    if (n > 0) {
                        
                        for(int i=0; i<n; i++){
                            int num = lgFibonacci.recursivo(i);
                            areaTexto.append(Integer.toString(num));
                           areaTexto.append("\n");
                        }
                        areaTexto.append("\n");
                    }else{
                        areaTexto.append("NUMERO NO VALIDO\n");
                    }
                } catch (NumberFormatException ex) {
                    areaTexto.append("NUMERO NO VALIDO.\n");
                }
            }    
        });   
        btnLimpiar = new JButton("LIMPIAR");
        btnLimpiar.setBounds(700,250, 100, 30);
        btnLimpiar.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent ev2){
                txtlongitud.setText("");
                areaTexto.setText("");
            }
        });
        btnSalir = new JButton("SALIR");
        btnSalir.setBounds(1000,250, 100, 50);
        btnSalir.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ev3){
                    System.exit(0);
                }
        });
        add(lbltitulo);
        add(lbltitulo1);
        add(lbllongitud);
        add(txtlongitud);
        add(btnSiguiente);   
        add(btnLimpiar);
        add(btnSalir);
        add(scroll);
    }
 }

