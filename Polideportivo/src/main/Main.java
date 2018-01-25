/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
import polideportivo.Polideportivo;

/**
 *
 * @author user
 */
public class Main {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Polideportivo polideportivo = new Polideportivo();
        
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
        sc.nextLine();
        
        switch (opcion) {
            case 1:
                polideportivo.darAltaAlumno();
                break;
            case 2:
                break;
            default:
                System.out.println("opcion no valida");
        }
    }
}
