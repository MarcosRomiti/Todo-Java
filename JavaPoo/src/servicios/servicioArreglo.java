/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.dosArreglos;
import java.util.Arrays;

/**
 *
 * @author Marcos
 */
public class servicioArreglo {
    
    public dosArreglos crearArreglos(int l){
        int[] array= new int[50];
        for (int i = 0; i < l; i++) {
            
            array[i]=(int)(Math.abs((Math.random()*(100-0))+0));
        }
        return new dosArreglos(array);           
    }
    
    public void imprimirArray(int[] array, int l){
        int c=0;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("["+array[c]+"]");
                c++;
            }
            System.out.println("");
        }
    }
    
    public int[] ordenarArreglo(int[] array){
        Arrays.sort(array);
        return array;
    }
    
    public int[] ordenarArreglo2(int[] array1, int[] array2){
        
        for (int i = 0; i < 10; i++) {
            array2[i]=array1[i];
        }
        for (int i = 10; i < 20; i++) {
            array2[i]=-1;
        }
        return array2;
    }
}

