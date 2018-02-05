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
public abstract class Animal {
    
    protected int tiempoVida;
    protected boolean vivo;

    
    public abstract int getNumPatas();
    
    
    public boolean isVivo() {
        return vivo;
    }
    public int getTiempoVida() {
        return tiempoVida;
    }
    
    public Animal() {
        tiempoVida = 10;
        vivo = true;
    }
    
    public void herir(int daño)
    {
        tiempoVida -= daño;
        if (tiempoVida <=0)
            vivo = false;
    }
    
    
    public void alimentar()
    {
        if (vivo)
            tiempoVida ++;
    }
    
    public void enfermar()
    {
        if (vivo)
            tiempoVida -= 5;
    }
    
    
}
