/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polideportivo;

import java.util.Scanner;
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
        int numAlumnos = 0;

        Horario h = new Horario(10, 11, "L,X,V");
        Actividad a = new Actividad("areobic", 35, 47.60f, h);
        actividades[0] = a;
        h = new Horario(11, 12, "L,X,V");
        a = new Actividad("areobic", 35, 47.60f, h);
        actividades[1] = a;

        actividades[2] = new Actividad("areobic", 35, 47.60f,
          new Horario(19, 20, "L,X,V"));

        System.out.println("precio " + actividades[2].getPrecio());

        System.out.println(" hora" + actividades[0].getHorario().getHoraInicio());

        System.out.println("actividad 1  " + actividades[1]);

        Scanner sc = new Scanner(System.in);
        System.out.println("Elije el numero de ejercicio del 1 al 17, los enunciados son:\n"
          + "1. Dar Alta. \n"
          + "2. Baja Alumno \n"
          + "3. Matricular Alumno \n"
          + "4. Recibo Alumno \n"
          + "5. Recibo Actividad \n"
          + "4. Imprimir Alumnos \n"
          + "5. Imprimir Actividades \n");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                alumnos[numAlumnos] = darAltaAlumno();
                numAlumnos++;
                break;
            case 2:
                break;
            default:
                System.out.println("opcion no valida");
        }
    }

    public static Alumno darAltaAlumno() {
        // pedir nombre y apellidos por teclado

        //crear el alumno
        //devolver alumno
        return null;
    }

    public static void darBajaAlumno(Alumno[] alumnos) {
        //encontrar Alumno

        //Dar de baja de las actividades, aumentar plaza
        
        //reordenar array para no dejar huecos
        
        return;
    }

    public static int encontrarAlumno(Alumno[] alumnos, String nombre, String apellido) {
        //recorrer array de alumno buscando nombre y apellidos

        // alumnos[i].getNombre().equals(nombre) && 
        // alumnos[i].getApellidos().equals(apellidos)
        
        return 0;
    }
    
    public static void matricularAlumno(Alumno[]alumnos, Actividad[] actividades)
    {
        //pedir alumno
        
        //encontrarle en el array
        
        //encontrar actividad
        
        //quitar plaza
        
        // aumentar el dinero del alumno
        
        
    }
}
