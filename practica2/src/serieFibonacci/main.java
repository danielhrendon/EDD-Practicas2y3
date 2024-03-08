/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serieFibonacci;

import javax.swing.JFrame;

/**
 *
 * @author danie
 */
public class main {
    public static void main (String args[]){
        guiFibonacci GUI = new guiFibonacci();
        GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUI.setVisible(true);
        GUI.setLocationRelativeTo(null);
    }
}
