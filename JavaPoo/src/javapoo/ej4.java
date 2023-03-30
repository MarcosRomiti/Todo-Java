/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapoo;

import entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class ej4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Rectangulo rec=new Rectangulo();
        System.out.println("Ingrese valores para base y altura:");
        System.out.print("Base: ");
        rec.setBase(leer.nextInt());
        System.out.print("Altura: ");
        rec.setAltura(leer.nextInt());
        rec.superficie(rec.getBase(), rec.getAltura());
        rec.perimetro(rec.getBase(), rec.getAltura());
        rec.dibujar(rec.getBase(), rec.getAltura());
    }
}
