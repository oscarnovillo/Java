package com.modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class ConPaquete {
    
    
    private int valor ;
    private boolean hecho;
    private char letra;

    public ConPaquete() {
    }

    public ConPaquete(int valor, boolean hecho, char letra) {
        this.valor = valor;
        this.hecho = hecho;
        this.letra = letra;
    }

    
    
    
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        if (valor > 10)
            this.valor = valor;
    }

    public boolean isHecho() {
        return hecho;
    }

    public void setHecho(boolean hecho) {
        this.hecho = hecho;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
    

    
    
    public void imprimir()
    {
        System.out.println("valor " + valor);
    }
    

    
}
