/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polideportivo;

import modelo.Actividad;
import modelo.Alumno;
import modelo.Horario;

/**
 *
 * @author user
 */
public class Polideportivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Actividad[] actividades = new Actividad[20];
        Alumno[] alumnos = new Alumno[50];
        
        Horario h = new Horario(10, 11, "L,X,V");
        Actividad a = new Actividad("areobic", 35, 47.60f, h);
        actividades[0] = a;
        h = new Horario(11, 12, "L,X,V");
        a = new Actividad("areobic", 35, 47.60f, h);
        actividades[1] = a;
        
        actividades[2] = new Actividad("areobic", 35, 47.60f,
        new Horario(19, 20, "L,X,V"));
        
        System.out.println("precio "+actividades[2].getPrecio());
        
        System.out.println(" hora"+actividades[0].getHorario().getHoraInicio());
        
        System.out.println("actividad 1  "+actividades[1]);
    }
    
}
