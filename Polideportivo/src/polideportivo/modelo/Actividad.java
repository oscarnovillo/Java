/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polideportivo.modelo;

/**
 *
 * @author user
 */
public class Actividad {

    private String tipo;
    private int plazas;
    private float precio;
    private int plazasLibres;
    private Horario horario;
    private Alumno[] alumnos;

    public Actividad(String tipo, int plazas, float precio,
      Horario horario) {

        this.tipo = tipo;
        this.plazas = plazas;
        this.precio = precio;
        this.plazasLibres = this.plazas;
        this.horario = horario;
        alumnos = new Alumno[this.plazas];
    }

   public boolean delAlumno(Alumno a){
       boolean ok = false;
       for (int i=0;i<this.alumnos.length;i++)
           
       {
           if (a.equals(this.alumnos[i]))
           {
               int ultimo = plazas-plazasLibres-1;
               alumnos[i] = alumnos[ultimo];
               alumnos[ultimo] = null;
               plazasLibres ++;
           }
           
       }
       return ok;
   }
    
    public boolean addAlumno(Alumno a) {
        boolean ok = false;
        if (plazasLibres > 0) {
            this.alumnos[this.plazas - this.plazasLibres] = a;
            this.plazasLibres--;
            ok = true;
        }
        return ok;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getPlazasLibres() {
        return plazasLibres;
    }

    public void setPlazasLibres(int plazasLibres) {
        this.plazasLibres = plazasLibres;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        String imprimir = "Actividad{" + "tipo=" + tipo + ", \n precio=" + precio + "€, \nplazasLibres=" + plazasLibres + ", horario=" + horario + '}';
        
        for (int i =0;i<alumnos.length;i++)
        {
            imprimir += alumnos[i].toString();
        }
        
        imprimir += "\n";
        return imprimir;
    }

}
