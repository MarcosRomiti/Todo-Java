/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.cadena;

/**
 *
 * @author Marcos
 */
public class servicioCadena {
    
    public void mostrarVocales(String fra, int l){
        int c=0;
        for (int i = 0; i < l; i++) {
        String le=fra.substring(i,i+1);
            if ("a".equals(le)||"e".equals(le)||"i".equals(le)||"o".equals(le)||"u".equals(le)) {
                c++;
            }
            
        }
        System.out.println("La frase contiene "+c+" vocales.");
        
    }
    
    public void invertirFrase(String fra, int l){
        int c=l;
        for (int i = 0; i < l; i++) {
        String let=fra.substring(c-1,c);
            System.out.print(let);
            c--;
        }
        System.out.println("");
    }
    
    public void vecesRepetido(String fra, int lon, String l){
        int c=0;
        for (int i = 0; i < lon; i++) {
        String le=fra.substring(i,i+1);
            if (l.equals(le)) {
                c++;
            }
        }
        if (c>1) {
        System.out.println("El caracter ingresado "+l+" se repite "+c+" veces.");
        }else if(c==1){
            System.out.println("El caracter ingresado "+l+" se repite "+c+" vez.");
        }else{
            System.out.println("El caracter ingresado "+l+" no se encuentra dentro de la frase.");
        }
    }
    
    public void compararLongitud(int  l, String fra){
        int f=fra.length();
        if (l==f) {
            System.out.println("Las frases tienen la misma cantidad de caracteres");
        }else{
            System.out.println("Las frases NO tienen la misma cantidad de caracteres");
        }
    }
    
    public void unirFrases(String f, String fra){
        System.out.println(f+" "+fra);
        
    }
    
    public void reemplazar(String f, int l, String let){
        
        for (int i = 0; i < l; i++) {
        String le=f.substring(i,i+1);
            if ("a".equals(le)) {
                le=let;
            }
            System.out.print(le);
        }
        System.out.println("");   
    }
    
    public boolean contiene(String f, int l, String let){
        boolean siono=false;
        for (int i = 0; i < l; i++) {
        String le=f.substring(i,i+1);
            if (let.equals(le)) {
                siono=true;
            } 
        } 
        return siono;
    }
}
