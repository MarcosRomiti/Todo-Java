/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapoo;

import entidades.raices;
import java.util.Scanner;
import servicios.servicioRaices;

/**
 *
 * @author Marcos
 */
public class el3ex {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        servicioRaices sr=new servicioRaices();
        System.out.println("Vamos a insertar los valores de la raíz cuadrática para obtener los valores");
        raices raiz=sr.insertarValores();
        sr.calcular(raiz.getA(), raiz.getB(), raiz.getC());
    }
}
