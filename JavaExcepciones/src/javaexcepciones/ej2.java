/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexcepciones;



/**
 *
 * @author Marcos
 */
public class ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        int[] a= new int[10];
        for (int i = 0; i < 10; i++) {
            a[i]=i;
        }
        for (int i = 0; i < 11; i++) {
            System.out.println("Intento "+i);
            System.out.println(a[i]);
        }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Índice de arreglo fuera de rango");
        }
    }
    
}
