
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales.main;

import animales.modelo.Animal;
import animales.modelo.Lince;
import animales.modelo.Oso;
import animales.modelo.Persona;
import animales.modelo.Rata;

/**
 *
 * @author user
 */
public class MainAnimales {
    
    
    public static void main(String[] args) {
        
        Persona kiko = new Persona();
        Rata rata = new Rata();
        Oso happy = new Oso();
        Lince pepa = new Lince();
        
        kiko.comer(rata);
        kiko.hacerZapatos(pepa);
        kiko.hacerZapatos(happy);
        
        happy.cazar(kiko);
        System.out.println("oso "+happy.getTiempoVida());
        pepa.cazar(happy);
        
        happy.hibernar();
        
        System.out.println("lince "+pepa.getTiempoVida());
        System.out.println("oso "+happy.getTiempoVida());
        
    }
}
