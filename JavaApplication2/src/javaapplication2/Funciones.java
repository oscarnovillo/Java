/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Funciones {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []array = new int[10];
        
        int valorSumar = 1;
        System.out.println(valorSumar);
        int []array2 = recorrerArray(array,valorSumar);
        System.out.println(valorSumar);
        recorrerArray(array2,valorSumar);
        
    }
    
    public static int [] recorrerArray(int []array,int valorSumar){
        for (int i = 0; i < array.length; i++) {
            
            array[i]+=valorSumar;
            System.out.println(array[i]);
        }
        array = new int[2];
        array[0] = 10;
        valorSumar = 10;
        return array;
    }
    
}
