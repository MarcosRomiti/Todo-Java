/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapoo;

import entidades.cadena;
import java.util.Scanner;
import servicios.servicioCadena;

/**
 *
 * @author Marcos
 */
public class ej8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);    
        servicioCadena sc= new servicioCadena();
        cadena ca=new cadena();
        System.out.println("Ingrese una frase: ");
        ca.setFrase(leer.nextLine());
        ca.setLongitud(ca.getFrase().length());
        sc.mostrarVocales(ca.getFrase(),ca.getLongitud());
        sc.invertirFrase(ca.getFrase(),ca.getLongitud());
        System.out.println("Ingrese un caracter a contabilizar si se encuentra en la frase ingresada:");
        String l=leer.nextLine();
        sc.vecesRepetido(ca.getFrase(), ca.getLongitud(), l);
        System.out.println("Ingrese una nueva frase: ");
        String fra=leer.nextLine();
        sc.compararLongitud(ca.getLongitud(), fra);
        System.out.println("Ingrese una nueva frase para unirla con la anterior: ");
        String fraa=leer.nextLine();
        sc.unirFrases(ca.getFrase(), fraa);
        System.out.println("Ingrese un caracter para reemplazar las A:");
        String letra=leer.next();
        sc.reemplazar(ca.getFrase(),ca.getLongitud(), letra);
        System.out.println("Ingrese un caracter para buscar dentro de la frase:");
        String letra2=leer.next();
        boolean boo=sc.contiene(ca.getFrase(),ca.getLongitud(), letra2);
        System.out.println(boo);
        
    }
}
