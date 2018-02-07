
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales.main;

import animales.modelo.Animal;
import animales.modelo.Lince;
import animales.modelo.Oso;
import animales.modelo.Persona;
import animales.modelo.Rata;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class MainAnimales {

    public static void main(String[] args) {

        Persona kiko = new Persona();
        Rata rata = new Rata("jilquerita");
        Oso happy = new Oso("happy");
        Lince pepa = new Lince("pepa");

        ArrayList<Animal> lista = new ArrayList<>();
        System.out.println(lista.size());
        //ADD
        lista.add(pepa);
        lista.add(happy);
        lista.add(new Oso("yackie"));

        // sacar un elemento
        System.out.println(lista.get(0));

        //imprimir toda la lista
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        System.out.println("segunda manera");
        for (Animal elemento : lista) {
            elemento.herir(9);
            if (elemento instanceof Oso) {
                Oso oso = (Oso) elemento;
                oso.alimentar(kiko);
                oso.alimentar();
                oso.hibernar();
                System.out.println(oso);
            }

        }

        //borrar elementos
        lista.remove(new Oso("happy"));
        for (Animal elemento : lista) {
            System.out.println(elemento);
        }

        //encontrar elemento
        System.out.println(lista.contains(new Oso("kkkk")));

        System.out.println(
          lista.get(lista.indexOf(new Oso("yackie"))));

        for (Animal elemento : lista) {
            if (elemento.getTiempoVida() > 4) {
                System.out.println(elemento);
            }
        }

    }
}
