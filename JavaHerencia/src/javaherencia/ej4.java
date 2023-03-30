/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaherencia;

import entities.circulo;
import entities.rectangulo;
import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class ej4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String op;
        boolean boo = true;
        do {
            System.out.println("Si desea calcular Área digite A \n"
                    + "Si desea calcular perímetro digite P \n"
                    + "Si desea salir digite S");
            op = leer.next().toUpperCase();
            switch (op) {
                case "A":
                    System.out.println("Calcular área:\n"
                            + "Para calcular el àrea de un círculo digite C \n"
                            + "Para calcular el àrea de un rectángulo digite R \n");
                    op = leer.next().toUpperCase();
                    switch (op) {
                        case "C":
                            System.out.print("Ingrese el radio: ");
                            int r = leer.nextInt();
                            circulo cir = new circulo(r);
                            System.out.println("El área del círculo con radio " + r + " es: " + cir.calculoArea());
                            break;
                        case "R":
                            System.out.println("Ingrese la base y la altura:");
                            int b = leer.nextInt();
                            int a = leer.nextInt();
                            rectangulo rec=new rectangulo(b,a);
                            System.out.println("El área del rectangulo con base " + b + " y altura " + a + " es: " + rec.calculoArea());
                            break;

                        default:
                            System.out.println("Opción incorrecta, intente nuevamente.");
                    }
                    break;
                case "P":

                    System.out.println("Calcular perímetro:\n"
                            + "Para calcular el perímetro de un círculo digite C \n"
                            + "Para calcular el perímetro de un rectángulo digite R \n");
                    op = leer.next().toUpperCase();
                    switch (op) {
                        case "C":
                            System.out.print("Ingrese el diámetro: ");
                            int d = leer.nextInt();
                            circulo cir = new circulo(d/2);
                            System.out.println("El perímetro del círculo con diámetro " + d + " es: " + cir.calculoPerímetro());
                            break;
                        case "R":
                            System.out.println("Ingrese la base y la altura:");
                            int b = leer.nextInt();
                            int a = leer.nextInt();
                            rectangulo rec=new rectangulo(b,a);
                            System.out.println("El perímetro del rectangulo con base " + b + " y altura " + a + " es: " + rec.calculoPerímetro());
                            break;
                        default:
                            System.out.println("Opción incorrecta, intente nuevamente.");
                    }
                    break;
                case "S":
                    boo = false;
                    break;
                default:
                    System.out.println("Opción incorrecta, intente nuevamente.");
            }
        } while (boo);

    }
}
