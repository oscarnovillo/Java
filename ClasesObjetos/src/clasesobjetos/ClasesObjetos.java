/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesobjetos;

import com.modelo.ConPaquete;



/**
 *
 * @author user
 */
public class ClasesObjetos {

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Chispas chispas = new Chispas();
        ConPaquete sin =  new ConPaquete();
        sin.setValor(10);
        sin.setHecho(true);
        sin.setLetra('p');
        
        ConPaquete conValores =  
          new ConPaquete(10,true,'p');
        
        
        ConPaquete con =  new ConPaquete();
        con.setValor(7);     
        ConPaquete def = cambia(sin);
   
        System.out.println(" Con "+con.getValor());
        System.out.println(" sin "+sin.getValor());
        def.imprimir();
        
        
    }
    
    
    public static ConPaquete cambia(ConPaquete con)
    {
        con = new ConPaquete();
       con.setValor(0);
       return con;
    }
}
