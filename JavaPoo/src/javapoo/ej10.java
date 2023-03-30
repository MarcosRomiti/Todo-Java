/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapoo;

import entidades.dosArreglos;
import servicios.servicioArreglo;

/**
 *
 * @author Marcos
 */
public class ej10 {
    public static void main(String[] args) {
        
        servicioArreglo sa=new servicioArreglo();
        dosArreglos ar=sa.crearArreglos(50);
        System.out.println("Creamos el arreglo 1  con números aleatorios y lo imprimimos:");
        sa.imprimirArray(ar.getArray1(), 5);
        ar.setArray1(sa.ordenarArreglo(ar.getArray1()));
        System.out.println(" ");
        System.out.println("Ordenamos el arreglo 1 de menor a mayor y lo imprimimos:");
        sa.imprimirArray(ar.getArray1(), 5);
        dosArreglos arr=sa.crearArreglos(20);
        System.out.println("Creamos el arreglo 2 con n,umeros aleatorios y lo imprimimos:");
        sa.imprimirArray(arr.getArray1(), 2);
        arr.setArray1(sa.ordenarArreglo2(ar.getArray1(), arr.getArray1()));
        System.out.println("Trasladamos los valores de los primeros 10 números del arreglo 1 al 2, cambiamos los 10 restantes y lo imprimimos:");
        sa.imprimirArray(arr.getArray1(), 2);
    }
}
