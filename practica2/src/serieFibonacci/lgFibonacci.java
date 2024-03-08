/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serieFibonacci;

/**
 *
 * @author danie
 */
public class lgFibonacci {
    public static int recursivo(int num) {
        if (num <=1){
            return 1;
        }
        return recursivo(num - 1) + recursivo(num - 2);
    }
}