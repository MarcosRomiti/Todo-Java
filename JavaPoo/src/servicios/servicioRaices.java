/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.raices;
import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class servicioRaices {
    
    public raices insertarValores(){
        Scanner leer = new Scanner(System.in);
        System.out.print("Inserte el valor de A: ");
        int a=leer.nextInt();
        System.out.print("Inserte el valor de B: ");
        int b=leer.nextInt();
        System.out.print("inserte el valor de C: ");
        int c=leer.nextInt();
        System.out.println("\n ");
        
        return new raices(a, b, c);
    }
    
    public double discriminante(int a, int b, int c){
        double d=Math.sqrt((Math.pow(b, 2))-4*a*c);
        System.out.println(d);
        return d;
    }
        
    public boolean tieneRaices(double d){
        boolean boo=false;
        if (d>0) {
            boo=true;
        }
        
        return boo;
    }
    
    public boolean tieneRaiz(double d){
        boolean boo=false;
        if (d==0) {
            boo=true;
        }
        
        return boo;
    }
    
    public void obtenerRaices(double d, int a, int b, int c){
        double r1=(-b+d)/(2*a);
        double r2=(-b-d)/(2*a);
        System.out.println("Las soluciones son "+r1+" y "+r2);
    }
    
    public void obtenerRaiz(double d, int a, int b, int c){
        double r1=(-b+d)/(2*a);
        System.out.println("La solucion es "+r1);
    }
    
    public void calcular(int a, int b, int c){
        
        double d1=discriminante(a, b, c);
        boolean b1=tieneRaices(d1);
        boolean b2=tieneRaiz(d1);
        
        if (b1==true) {
            obtenerRaices(d1, a, b, c);
        }else if(b1==false&&b2==true){
            obtenerRaiz(d1, a, b, c);
        }else{
            System.out.println("No tiene solución");
        }
    }
}
