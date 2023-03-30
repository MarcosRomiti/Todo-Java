/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarelaciones;

import entities.Curso;
import entities.dni;
import entities.persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class JavaRelaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        /* manos a la obra 1
        persona p1=new persona();
        dni dni1 = new dni();
        dni1.setNumero(1414616);
        String serie= leer.nextLine();
        dni1.setSerie(serie);
        p1.setDni(dni1);
        System.out.println(p1.getDni().toString());
        
        
        //manos a la obra 2
        Curso cu = new Curso();
        ArrayList<persona> alumno= new ArrayList();
        boolean boo=true;
        while (boo) {
            persona p1= new persona();
            dni dni1=new dni();
            System.out.print("Nombre: ");
            String nombre=leer.next();
            System.out.print("Apellido: ");
            String apellido=leer.next();
            System.out.print("N DNI: ");
            int dni11=leer.nextInt();
            p1.setApellido(apellido);
            p1.setNombre(nombre);
            dni1.setNumero(dni11);
            p1.setDni(dni1);
            alumno.add(p1);
            System.out.print("Agregar otro mas?");
            String op=leer.next();
            if (op.equals("s")) {
                System.out.println("");
            }else{
                boo=false;
            }
        }
        for (persona object : alumno) {
            System.out.println(object.toString());
        }
        */
        int a=(int)(Math.random()*6+1);
        System.out.println(a);
    }
    
}
