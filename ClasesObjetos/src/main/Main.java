/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import funcionalidad.Calculadora;
import funcionalidad.Carta;
import funcionalidad.Palos;



/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        
        Calculadora cal = new Calculadora(10,2);
        System.out.println("sumar sin datos "+cal.sumar());
        cal.setOp1(12);
        cal.setOp2(2);
        System.out.println("suma "+cal.sumar());
        System.out.println("resta "+cal.restar());
        
        int colocar[] = new int[4];
        Carta c = new Carta();
        c.setPalo(Palos.OROS);
        System.out.println(c.getPalo().ordinal());
        colocar[Palos.OROS.ordinal()] = 9;
        
        
        
    }
}
