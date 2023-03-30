/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarelaciones;

import entities.Perro;
import entities.dni;
import entities.persona;
import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class ej1 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    persona p1=new persona();
    persona p2=new persona();
    dni dni1=new dni();
    Perro pe1=new Perro();
    Perro pe2=new Perro();
    System.out.println("Persona 1:");
    System.out.print("Nombre: ");
    p1.setNombre(leer.next());
    System.out.print("Apellido: ");
    p1.setApellido(leer.next());
    System.out.print("DNI: ");
    dni1.setNumero(leer.nextInt());
    p1.setDni(dni1);
    
    System.out.println("Persona 2:");
    System.out.print("Nombre: ");
    p2.setNombre(leer.next());
    System.out.print("Apellido: ");
    p2.setApellido(leer.next());
    System.out.print("DNI: ");
    dni1.setNumero(leer.nextInt());
    p2.setDni(dni1);
    
    System.out.println("Perro 1:");
    System.out.print("Nombre: ");
    pe1.setNombre(leer.next());
    System.out.print("Raza: ");
    pe1.setRaza(leer.next());
    System.out.print("Edad: ");
    pe1.setEdad(leer.nextInt());
    
    System.out.println("Perro 2:");
    System.out.print("Nombre: ");
    pe2.setNombre(leer.next());
    System.out.print("Raza: ");
    pe2.setRaza(leer.next());
    System.out.print("Edad: ");
    pe2.setEdad(leer.nextInt());
    
    p1.setPerro(pe1);
    p2.setPerro(pe2);
    
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
