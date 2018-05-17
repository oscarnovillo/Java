/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import dao.ConexionSimpleBD;
import java.util.List;
import model.Alumno;

/**
 *
 * @author user
 */
public class Main {

    public static void main(String[] args) {
        ConexionSimpleBD c = new ConexionSimpleBD();

        c.crearModeloJDBC();
        List<Alumno> alumnos = c.getAllAlumnosJDBC();
        for (Alumno a : alumnos) {
            System.out.print(a.getNombre());
            System.out.print(a.getId());
             System.out.print(a.getMayor_edad());
              System.out.println(a.getFecha_nacimiento());
        }
        Alumno a = c.getAlumnoJDBC(903);
        a.setNombre("Salah");
        c.updateAlumnoJDBC(a);
        System.out.println(a.getNombre());
        System.out.println(a.getMayor_edad());
        a = c.getAlumnoJDBC(403);
        System.out.println("despues "+a.getNombre());
        System.out.println("fila insertadas "+c.insertAlumnoJDBC(a));
        System.out.println(a.getId());
    }

}
