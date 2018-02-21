/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HasMapExample;

import Fechas.Constantes;
import animales.modelo.Oso;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author user
 */
public class HashMap1 {

    public static void main(String[] args) {
        Oso happy = new Oso("happy");

        Oso happySon = new Oso("bulbo");
        Oso happySon2 = new Oso("Maverick");
        Oso happyDaughter = new Oso("yanice");

        Map<String, Oso> h = new LinkedHashMap<>();

        // meter cosas
        h.put("happy", happy);
        h.put(happySon.getNombre(), happySon);
        h.put(happySon2.getNombre(), happySon2);
        h.put(happyDaughter.getNombre(), happyDaughter);

        //sacar cosas
        Oso temp = h.get("happy");
        System.out.println(temp);

        //recorrer 
        for (String key : h.keySet()) {
            System.out.println(h.get(key));
        }
        System.out.println("--------------");
        for (Oso oso : h.values()) {
            System.out.println(oso);
        }

        System.out.println("--------------");

        Iterator<Oso> osos = h.values().iterator();
        while (osos.hasNext()) {
            Oso oso = osos.next();
            System.out.println(oso);
        }

        System.out.println("--------------");

        Map<Integer, Oso> hOsos = new LinkedHashMap<>();

        hOsos.put(Constantes.ADMIN_ID, happy);
        System.out.println(hOsos.get(20).getNumPatas());
        
        // mirar si existe un elemento en un hash
        Oso existe = hOsos.get("noexiste");
        if (existe == null)
        {
            System.out.println("no existe");
        }
        
        
        

    }

}
