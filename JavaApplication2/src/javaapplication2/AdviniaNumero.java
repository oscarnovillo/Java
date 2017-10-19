/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Random;

/**
 *
 * @author user
 */
public class AdviniaNumero {

    public static void main(String[] args) {
        //elegir numero aleatorio
        Random generadorNumerosAleatorios = new Random();
        int aleatorio = generadorNumerosAleatorios.nextInt(50) + 1;

        //pedir numero al usuario 
        int num = 20;
        boolean b = true;

        //comprobar si es igual, mayor o menor
        if (num == aleatorio) {
            System.out.println("ok acertaste.");
        } else if (num > aleatorio) {
            System.out.println("mayor");
        } else if (num < aleatorio) {
            System.out.println("menor");
        }
        //sacar por pantalla lo que pasa
        // volver a pedir numero si no esta bien, ir arriba
    }

}
