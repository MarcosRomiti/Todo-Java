/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapoo;

import entidades.moviles;
import java.util.Scanner;
import servicios.serviciomoviles;

/**
 *
 * @author Marcos
 */
public class ej14 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        serviciomoviles sm=new serviciomoviles();
        sm.setCantidad(0);
        moviles[] mo=new moviles[100];
        menu(sm.getCantidad(), sm, mo);
    }
    
    public static void menu(int cant, serviciomoviles sm, moviles[] mo){
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvendio al software de móviles 3000");
        System.out.println("Elija una opción:");
        System.out.println("1- Mostrar móviles");
        System.out.println("2- Ingresar móvil nuevo");
        System.out.println("3- Salir");
        int op=leer.nextInt();
        
        switch (op) {
            
            case 1:
                if (cant==0) {
                    System.out.println("Aún no hay móviles ingresados");
                    
                }else{
                    
                    for (int i = 0; i < cant; i++) {
                        System.out.println("Móvil " + i + ":");
                        System.out.println("Marca: " + mo[i].getMarca());
                        System.out.println("Modelo: " + mo[i].getModelo());
                        System.out.println("Ram: "+mo[i].getRam()+"Gb");
                        System.out.println("Almacenamiento interno: "+mo[i].getAlmInt()+"Gb");
                        System.out.println("Precio: $"+mo[i].getPrecio());
                        System.out.print("Código: ");
                        for (int j = 0; j < 7; j++) {
                            System.out.print(mo[i].getCodigo()[j]); 
                        }
                        System.out.println("\n ");
                    }
                }
                menu(sm.getCantidad(), sm, mo);
                break;
            
            case 2:
                mo[cant]=sm.crearMovil();
                sm.setCantidad(sm.getCantidad()+1);
                menu(sm.getCantidad(), sm, mo);
                break;
                
            
            case 3:
                System.out.println("Seguro que desea salir? S/N");
                String op2=leer.next();
                    switch (op2) {
                        case "s":
                            System.out.println("Saliendo...");
                            break;
                        case "n":
                            menu(sm.getCantidad(), sm, mo);
                            break;
                        default:
                            System.out.println("Opción incorrecta, intente nuevamente.");
                            menu(sm.getCantidad(), sm, mo);
                            break;
                    }
            default:
                System.out.println("Opción inválida, inténtelo nuevamente.");
                menu(sm.getCantidad(), sm, mo);
                
        }
        
    }
}
