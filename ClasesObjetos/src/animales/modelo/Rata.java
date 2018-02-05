/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales.modelo;

/**
 *
 * @author user
 */
public class Rata extends Animal implements ICazable{

    
    
    @Override
    public void enfermar() {
       
        tiempoVida -= 0;
    }

    @Override
    public int satisfaccion() {
       return 5;
    }

    @Override
    public int getNumPatas() {
        return 4;
    }
    
    
    
}
