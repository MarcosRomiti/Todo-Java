/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapoo;

import entidades.puntos;
import java.util.Scanner;
import servicios.servicioPuntos;

/**
 *
 * @author Marcos
 */
public class ej2ex {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        servicioPuntos sp=new servicioPuntos();
        
        System.out.println("Vamos a crear dos puntos y calcular su distancia:");
        System.out.println("Punto 1:");
        puntos P1=sp.crearPuntos();
        System.out.println("Punto 2:");
        puntos P2=sp.crearPuntos();
        
        double d=sp.calcularDistancia(P1.getX(), P1.getY(), P2.getX(), P2.getY());
        
                System.out.println("El resultado es: "+d);
    }
}
