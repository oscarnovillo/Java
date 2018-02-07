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
public class Lince extends Animal{

    public Lince(String nombre) {
        super(nombre);
    }
    
    
    public void cazar(ICazable caza)
    {
        tiempoVida += (caza.satisfaccion()/2);
    }

    @Override
    public int getNumPatas() {
       return 4;
    }
    
}
