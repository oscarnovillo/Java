/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polideportivo;

import java.util.Scanner;
import polideportivo.modelo.Actividad;
import polideportivo.modelo.Alumno;
import polideportivo.modelo.Horario;

/**
 *
 * @author user
 */
public class Polideportivo {

    private Actividad[] actividades;
    private Alumno[] alumnos;
    private int numAlumnos = 0;

    public Polideportivo() {
        alumnos = new Alumno[50];
        actividades = new Actividad[20];
        
        Horario h = new Horario(10, 11, "L,X,V");
        Actividad a = new Actividad("areobic", 35, 47.60f, h);
        actividades[0] = a;
        h = new Horario(11, 12, "L,X,V");
        a = new Actividad("areobic", 35, 47.60f, h);
        actividades[1] = a;

        actividades[2] = new Actividad("areobic", 35, 47.60f,
          new Horario(19, 20, "L,X,V"));
    }

    public Alumno darAltaAlumno() {
        // pedir nombre y apellidos por teclado

        //crear el alumno
        //devolver alumno
        return null;
    }

    public void darBajaAlumno(Alumno a) {
        //encontrar Alumno
        int encontrado = -1;

        for (int i = 0; i < alumnos.length; i++) {
            System.out.println(alumnos[i]);
//            if (alumnos[i].equals(a)) {
//                encontrado = i;
//            }
        }

        //Dar de baja de las actividades, aumentar plaza
        //reordenar array para no dejar huecos
        alumnos[encontrado] = alumnos[numAlumnos - 1];
        alumnos[numAlumnos - 1] = null;
        numAlumnos--;

        return;
    }

    private int encontrarAlumno(String nombre, String apellido) {
        //recorrer array de alumno buscando nombre y apellidos
        Alumno temp = new Alumno(nombre, apellido);

        //alumnos[i].equals(temp);
        // alumnos[i].getNombre().equals(nombre) && 
        // alumnos[i].getApellidos().equals(apellidos)
        return 0;
    }

    public void matricularAlumno() {
        //pedir alumno

        //encontrarle en el array
        //encontrar actividad
        //quitar plaza
        // aumentar el dinero del alumno
    }
}
