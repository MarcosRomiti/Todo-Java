/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexcepciones;

import static java.lang.Integer.parseInt;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class ej3y4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        try{
        String a =leer.next();
        String b =leer.next();
        int a1=parseInt(a);
        int b1=parseInt(b);
        int a2=a1/b1;
        System.out.println(a2);
        }catch(InputMismatchException e){
            System.out.println("Error de ingreso por teclado");
        }catch(NumberFormatException e){
            System.out.println("No se ha ingresado un número");
        }catch(ArithmeticException e){
            System.out.println("Error al hacer el cálculo");
        }
    }
}
