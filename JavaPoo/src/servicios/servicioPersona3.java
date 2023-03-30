/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Persona3;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class servicioPersona3 {
    Scanner leer = new Scanner(System.in);  
    
    
    public Persona3 crearPersona(){
        System.out.print("Ingresar nombre: ");
        String nombre=leer.nextLine();
        return new Persona3(nombre);
    }
    
    public Date fechaNacimiento(){
        System.out.println("Ingresar fecha de nacimiento");
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
        return new Date((anio-1900),(mes-1),dia);
    }
    
    public int calcularEdad(int fa, int fn){
        int edad=fa-fn;
        return edad;
    }
    
    public boolean menorQue(int edad1, int edad2){
        boolean edad=false;
        if (edad1<edad2) {
            edad=true;
        }
        return edad;
    }
    
    public void mostrarPersona(Persona3 p1){
        System.out.println("*Persona 1*");
        System.out.println("Nombre: "+p1.getNombre());
        System.out.println("Edad: "+p1.getEdad());
    }
}
