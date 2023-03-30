/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapoo;


import java.util.Date;
import java.util.Scanner;


/**
 *
 * @author Marcos
 */
public class ej11 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Date fechaActual= new Date();
        System.out.println("La fecha actual es: "+fechaActual.getDate()+"/"+fechaActual.getMonth()+"/"+(1900+fechaActual.getYear()));
        System.out.println("Ingresemos una fecha aleatoria:");
        System.out.print("Día: ");
        int dia=leer.nextInt();
        if (dia>31) {
            do {
            System.out.print("Dato inválido, ingréselo de nuevo: ");
            dia=leer.nextInt();
            }while (dia>31);
        }
        System.out.print("Mes: ");
        int mes = leer.nextInt();
        if (mes>12) {
            do{
            System.out.print("Dato inválido, ingréselo de nuevo: ");
            mes = leer.nextInt();
            }while(mes>12);
        }
        System.out.print("Año: ");
        int anio = leer.nextInt();
        System.out.println("");

        int dif=(fechaActual.getYear()+1900)-anio;
        if (dif<0) {
            System.out.println("Para la fecha especificada faltan "+dif*-1+" años");
        }else if(dif>0){
            System.out.println("La fecha especificada fue "+dif+" años antes que la actual");
        }else{
            System.out.println("No hay diferencia de años entre ambas fechas");
        }
    }
}
