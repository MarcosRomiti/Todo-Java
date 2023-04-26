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
public class pruebax {
    public static void main(String[] args) {
        Persona p1=new Persona();
        String nombre = null;
        try {
            if (nombre==null) {
                p1.setNombre(nombre);
            }
  
        }catch(Exception e){
            System.out.println("error");
        }
        
        
    }
}