/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo2;

/**
 *
 * @author Phernandez
 */
public class Persona {
    String nombre;
    int edad;
    String direccion;

    //Constructor de la clase Persona esta sobrecargado
    public Persona(){
        nombre=null;
        edad=0;
        direccion=null;
        
    }
    
   
    public Persona(String nombre, int edad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }
    
     Persona(Persona usr){
        nombre=usr.getNombre();
        edad=usr.getEdad();
        direccion=usr.getDireccion();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        nombre = n;
    }


    //EL metodo setEdad() Esta sobrecargado
    public void setEdad(int e) {
        edad = e;
    }
    
     public void setEdad(float e) {
        edad = (int)e;
    }

      public int getEdad() {
        return edad;
    }
      
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String d) {
        direccion = d;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + 
                ", edad=" + edad +1+ 
                ", direccion=" + direccion + '}';
    }
    
    
}
