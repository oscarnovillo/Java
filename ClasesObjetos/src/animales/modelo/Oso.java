/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales.modelo;

import animales.modelo.Animal;

/**
 *
 * @author user
 */
public class Oso extends Animal implements ICazable{

    public Oso() {
       super();
       tiempoVida += 10;
    }

    @Override
    public void alimentar() {
        if (vivo)
            tiempoVida += 2;
    }
    
    public void cazar(ICazable caza)
    {
        tiempoVida += (caza.satisfaccion()/5);
    }
  
    
    public void hibernar()
    {
        if (vivo)
            tiempoVida += 10;
    }

    @Override
    public int satisfaccion() {
        vivo = false;
        tiempoVida = 0;
        return 50;
    }

    @Override
    public int getNumPatas() {
        return 2;
    }
    
}
