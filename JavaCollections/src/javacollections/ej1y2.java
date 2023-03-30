/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class ej1y2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<String> razas = new ArrayList();
        System.out.println("Ingrece una raza de perro");
        boolean boo;
        do {
            String nr=leer.nextLine();
            razas.add(nr);
            System.out.println("Desea añadir otra raza? S/N");
            String op=leer.nextLine();
            boo=true;
            if (op.equals("s")) {
                System.out.println("Ingrese otra raza:");
            }else if(op.equals("n")){
                boo=false;
            }else{
                System.out.println("Opción incorrecta");
            }
        } while (boo);
        System.out.println(" ");
        System.out.println("Las razas en la lista son:");
        for (String aux : razas) {
            System.out.println(aux);
        }
        System.out.println("Que raza desea eliminar?");
        String rae=leer.nextLine();
        
        Iterator iterator=razas.iterator();
        boolean boo2=true;
        while (iterator.hasNext()) {
            if (iterator.next().equals(rae)) {
                iterator.remove();
                boo2=false;
            }
        }
        if (boo2) {
            System.out.println("La raza ingresada no se enonctraba en la lista");
        }
        System.out.println(" ");
        System.out.println("Las razas en la lista son:");
        for (String raza : razas) {
                System.out.println(raza);
            }
    }
    

    
}
