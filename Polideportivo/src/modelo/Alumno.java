/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author user
 */
public class Alumno {
    
    private String nombre;
    private String apellidos;
    private float recibo;

    public Alumno(String nombre, 
      String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.recibo = 0;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public float getRecibo() {
        return recibo;
    }

    public void setRecibo(float recibo) {
        this.recibo = recibo;
    }
    
    
}
