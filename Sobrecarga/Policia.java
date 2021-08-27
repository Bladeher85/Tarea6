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
public class Policia extends Persona{
   public Policia(){
        super();
    
   }
public Policia(String nombre, int edad, String direccion){
    super(nombre,  edad, direccion);
}

public void imprimeUsuario(Persona usr){
    System.out.println("\nNombre: " + usr.nombre );
     System.out.println("Edad: " + usr.getEdad() );
     System.out.println("Direccion: " + usr.getDireccion() +"\n");
     
    
}
@Override
    public String toString() {
        return "Policia{"+
                super.toString()+
                "}";
    }
    public static void main(String args[])
   {
        Policia persona1 = new Policia("Paco",25,"Colonia vasquez");
      /* Se declaran dos objetos  */
      Policia usr1,usr2;

      /* Se utiliza el constructor por omisión */
      usr1 = new Policia("Javier",30,"Colonia vasquez");
      persona1.imprimeUsuario(usr1);

     /* Se utiliza el segundo constructor  */
      usr2 = new Policia("Eduardo",28,"Mi direccion");
      persona1.imprimeUsuario(usr2);

     

      usr1.setEdad(50);
      usr2.setEdad(30.45f);

      persona1.imprimeUsuario(usr1);
      persona1.imprimeUsuario(usr2);
   }
    
}

