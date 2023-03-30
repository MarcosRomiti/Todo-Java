/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapoo;

import entidades.Persona;

/**
 *
 * @author Marcos
 */
public class JavaPoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1=new Persona("Pepe", "aaa", "3624384328", "01/01/2000", "Arg", "email");
        Persona p2=new Persona("","","","","","");
        System.out.println(p1.nombre+" "+p2.nombre);
       p1.setNombre("Jose");
        
        p2.setNombre("Alejandro");
        System.out.println(p1.nombre+" "+p2.nombre);
        p1.nombre=p2.getNombre();
        System.out.println(p1.nombre);
    }
    

  
}
