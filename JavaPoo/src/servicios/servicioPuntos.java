/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.puntos;
import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class servicioPuntos {
    
    public puntos crearPuntos(){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el valor de X:");
        int x=leer.nextInt();
        System.out.print("Ingrese el valor de Y:");
        int y=leer.nextInt();
        
        return new puntos(x, y);
    }
    
    public double calcularDistancia(int x1, int y1, int x2, int y2){
        double P1=(x2-x1);
        double P2=(y2-y1);
        double d=Math.sqrt((Math.pow(P1,2))+(Math.pow(P2,2)));
        
        return d;
    }
}
