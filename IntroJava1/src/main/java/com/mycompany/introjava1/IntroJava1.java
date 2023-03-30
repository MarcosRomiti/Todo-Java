/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.introjava1;

import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class IntroJava1 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String nombre;
                
        System.out.println("Hola, ingrese su nombre");
        
        nombre=leer.next();
        
        System.out.println("Hola mundo! Soy " + nombre + " y este es mi primer programa en Java!");
    }
}
