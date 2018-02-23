/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fechas;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Fechas {

    public static void main(String[] args) {

        LocalDate fecha = LocalDate.now();

        LocalDate fecha1 = LocalDate.of(2018, 1, 10);

        fecha1.plus(10, ChronoUnit.DAYS);

        System.out.println(fecha1.format(DateTimeFormatter.ofPattern("dd/MMM/yyyy")));
        System.out.println(fecha.format(DateTimeFormatter.ofPattern("dd/MMM/yyyy")));

        Period p = Period.between(fecha, fecha1);
        System.out.println(p.getMonths());

        LocalDateTime reponedor = LocalDateTime.now();

        // esto simula tiempo
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        LocalDateTime cajero = LocalDateTime.now();

        System.out.println(reponedor.format(DateTimeFormatter.ofPattern("HH:mm")) + "   " + cajero);

        Duration d = Duration.between(reponedor, cajero);
        //estos son los seg desde que se repuso.
        long numSegundos = d.getSeconds();
        System.out.println("Seg pasados son " + numSegundos);
        double precioBase = 9.89;

        double descuento = numSegundos / Constantes.NUM_SEGUNDOS_BAJA_PRECIO
          * Constantes.FACTOR_BAJA_PRECIO * precioBase;

        if (numSegundos > Constantes.NUM_SEGUNDOS_CADUCA) {
            System.out.println("producto caducado");
        } else {
            System.out.println("tienes que pagar" + (precioBase - descuento));
        }

    }

}
