/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class ej5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num = (int)(Math.random()*500+1);
        System.out.println("Adivina el número secreto!");
        int i=0;
        while (true) {
        try{
            System.out.print("Introduzca un número: ");
            int a=leer.nextInt();
            if (a==num) {
                System.out.println("Correcto! El número secreto era "+num+", el número de intentos fué: "+i);
                break;
            }else if(a<num){
                System.out.println("El número secreto es mayor que "+a);
                i++;
            }else if(a>num){
                System.out.println("El número secreto es menor que "+a);
                i++;
            }
        }catch(InputMismatchException e){
            System.out.println("Error de ingreso por teclado");
            i++;
            leer.next();
        }catch(NumberFormatException e){
            System.out.println("No se ha ingresado un número");
            i++;
            leer.next();
        }catch(ArithmeticException e){
            System.out.println("Error al hacer el cálculo");
            i++;
            leer.next();
        }
        
        }
    }
}
