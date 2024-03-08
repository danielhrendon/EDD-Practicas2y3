/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torreHanoi;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author danie
 */
public class main {
    public static void main(String[] args) {
        guiHanoi GUI = new guiHanoi ();
        GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUI.setVisible(true);
        GUI.setLocationRelativeTo(null);

    }
}
