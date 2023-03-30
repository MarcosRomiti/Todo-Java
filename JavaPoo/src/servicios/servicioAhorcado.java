/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.ahorcado;
import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class servicioAhorcado {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public ahorcado crearJuego(){
        System.out.print("Ingrese la palabra: ");
        String palabra = leer.nextLine();
        int l=palabra.length(); //LONGITUD   
        String[] p=new String[l];
        for (int i = 0; i < l; i++) {
            p[i]=palabra.substring(i, i+1);
        }
        System.out.print("Ingrese la cantidad de jugadas: ");
        int jugadas=leer.nextInt();
        return new ahorcado(p, 0, jugadas, l);
    }
    
    public void longitud(int l){
        System.out.println("La longitud de la palabra a buscar es "+l);
    }
    
    public void juego(int l, int j, String[] palabra){
        int e=0,c=0;
        boolean encontrada=false, fin=true;
        String[] guiones = new String[l];
        String[] mal = new String[25];
        for (int i = 0; i < l; i++) {
            guiones[i]="_ ";
        }
        for (int i = 0; i < 25; i++) {
            mal[i]=" ";
        }
        System.out.print("Ingrese una letra a buscar: ");
        do {
        String letra=leer.next();
        encontrada=false;
        for (int i = 0; i < l; i++) {
            
            if (letra.equals(palabra[i])) {
                encontrada=true;
                guiones[i]=palabra[i];
                e++;
            }
        }
            if (encontrada) {
                
                System.out.println("La letra estaba");
                for (int i = 0; i < l; i++) {
                    System.out.print(guiones[i]);
                }
                System.out.println("\n ");
            }else{
                j--;
                System.out.println("La letra NO estaba, quedan "+j+" intentos.");
                mal[c]=(" "+letra);
                c++;
                System.out.print("Letras que no estaban: ");
                for (int i = 0; i < l; i++) {
                    System.out.print(mal[i]);
                }
                System.out.println("\n ");
            }
            
            if (j==0||e==l) {
                fin=false;
            }
            //do while es "mientras tal condición es verdadera", y while mientras la condición es falsa.
        } while (fin);
        
        if (j==0) {
            System.out.println("Game Over!");
        }else if(e==l){
            System.out.println("Winner!!!");
        }
    }
}
