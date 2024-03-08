/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torreHanoi;

import javax.swing.JTextArea;



/**
 *
 * @author Daniel
 */
public class lgHanoi {

    public void moveDisks(int n, char from, char to, char aux, JTextArea areaTexto) {
        if (n == 1) {
            areaTexto.append("Mover disco 1 de " + from + " a " + to + "\n");
            return;
        }
        moveDisks(n - 1, from, aux, to, areaTexto);
        areaTexto.append("Mover disco " + n + " de " + from + " a " + to+ "\n");
        moveDisks(n - 1, aux, to, from, areaTexto);
    }


    
}
