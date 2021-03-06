/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class TresEnRaya {

    public static void main(String[] args) {
        char[][] tresenraya = new char[3][3];
        imprimirTablero(tresenraya);
        for (int i = 0; i < tresenraya.length; i++) {
            for (int j = 0; j < tresenraya[i].length; j++) {
                tresenraya[j][i] = '-';
            }

        }
        // poner una coordenada
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        tresenraya[x][y] = 'X';

        // for de 9 veces, se sale si hay 3 en raya
        // se pide celda a poner, comprobar que no estaba ocupada
        //si esta ocupada pedir otra.
        // comprobar 3 en raya en funcion
        // dentro de la funcion llamar a funcion comprobarfila, comprobarcolumna
        // y comprobar diagonales.
        // misma fila
        char turno = 'X';
        boolean ganar = true;

        imprimirTablero(tresenraya);

    }

    public static boolean comprobarFila(char[][] tablero, char turno, int x) {
        boolean tresEnRaya = true;
        for (int i = 0; i < 3 && tresEnRaya; i++) {
            if (tablero[x][i] != turno) {
                tresEnRaya = false;
            }
        }

        return tresEnRaya;
    }

    public static boolean comprobarTresEnRaya(char[][] tablero, char turno,
      int x, int y) {
        boolean tresEnRaya = false;

        tresEnRaya = comprobarFila(tablero, turno, x);
        if (tresEnRaya==false) {
            tresEnRaya = comprobarFila(tablero, turno, x);
            if (!tresEnRaya) {
                tresEnRaya = comprobarFila(tablero, turno, x);
            }
        }

        return tresEnRaya;
    }

    public static void imprimirTablero(char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[j][i]);
            }
            System.out.println("");
        }
    }
}
