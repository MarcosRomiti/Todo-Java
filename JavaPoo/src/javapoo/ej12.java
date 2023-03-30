/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapoo;

import entidades.Persona3;
import java.util.Date;
import java.util.Scanner;
import servicios.servicioPersona3;

/**
 *
 * @author Marcos
 */
public class ej12 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Date fa=new Date();
        servicioPersona3 sp=new servicioPersona3();
        Persona3 p1=sp.crearPersona();
        Date p1fn=sp.fechaNacimiento();
        p1.setEdad(sp.calcularEdad(fa.getYear(),p1fn.getYear()));
        System.out.println("La persona "+p1.getNombre()+" tiene "+p1.getEdad()+" años.");
        System.out.println("Ingrese otra edad para calcular cual es mas grande");
        int edad =leer.nextInt();
        System.out.println("la persona ingresada anteriormente tiene mas edad que la ingresada al principio? "+sp.menorQue(p1.getEdad(),edad));
        sp.mostrarPersona(p1);
    }
}
