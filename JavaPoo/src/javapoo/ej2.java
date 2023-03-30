/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapoo;

import entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class ej2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Por favor ingrese el radio para calcular area y circunferencia: ");
        Circunferencia c1= new Circunferencia(0);
        c1.setRadio(leer.nextInt());
        c1.area(c1.getRadio());
        c1.perimetro(c1.getRadio());
        
    }
}
