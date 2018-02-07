/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales.modelo;

import java.util.Objects;

/**
 *
 * @author user
 */
public abstract class Animal {

    protected int tiempoVida;
    protected boolean vivo;

    private String nombre;

    public abstract int getNumPatas();

    public boolean isVivo() {
        return vivo;
    }

    public int getTiempoVida() {
        return tiempoVida;
    }

    public Animal(String nombre, int tiempoVida) {
        this.nombre = nombre;
        this.tiempoVida = tiempoVida;
        vivo = true;
    }

    public Animal(String nombre) {
        this(nombre,10);
    }

    public void herir(int daño) {
        tiempoVida -= daño;
        if (tiempoVida <= 0) {
            vivo = false;
        }
    }

    public void alimentar() {
        if (vivo) {
            tiempoVida++;
        }
    }

    public void enfermar() {
        if (vivo) {
            tiempoVida -= 5;
        }
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public String toString() {
        return "Animal{" + "tiempoVida=" + tiempoVida + ", vivo=" + vivo + ", nombre=" + nombre + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Animal other = (Animal) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

}
