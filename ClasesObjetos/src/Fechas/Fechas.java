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
        
        
        LocalDateTime time = LocalDateTime.now();

        Scanner sc = new Scanner(System.in);
        sc.next();
        LocalDateTime time1 = LocalDateTime.now();
        
        System.out.println(time.format(DateTimeFormatter.ofPattern("HH:mm"))+"   "+time1);
        
        Duration d = Duration.between(time, time1);
        System.out.println(d.getSeconds());
    }

}
