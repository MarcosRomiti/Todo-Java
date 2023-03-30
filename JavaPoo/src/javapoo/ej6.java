/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapoo;

import java.util.Scanner;
import entidades.cafetera;
/**
 *
 * @author Marcos
 */
public class ej6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        cafetera caf=new cafetera();
        System.out.println("Caferera Nepresso");
        
        menu(caf);
    }
    public static void menu(cafetera caf){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una opción:");
        System.out.println("1: Consultar café en depósito");
        System.out.println("2: Agregar café al depósito");
        System.out.println("3: Llenar depósito");
        System.out.println("4: Servir taza");
        System.out.println("5: Vaciar depósito");
        System.out.println("6: Salir");
        
        int op=leer.nextInt();
        
        OUTER:
        switch (op) {
            case 1:
                System.out.println("Capacidad actual "+caf.getCapAct());
                System.out.println("Capacidad maxima "+caf.getCapMax());
                menu(caf);
                break;
            case 2:
                System.out.println("Ingrese café al depósito: ");
                caf.setCapAct(caf.ingresar(caf.getCapAct(), caf.getCapMax()));
                menu(caf);
                break;
            case 3:
                caf.setCapAct(caf.llenar(caf.getCapMax(),caf.getCapAct()));
                System.out.println("Cafetera llena");
                menu(caf);
                break;
            case 4:
                caf.setCapAct(caf.servir(caf.getCapAct()));
                menu(caf);
                break;
            case 5:
                caf.setCapAct(caf.vaciar(caf.getCapAct()));
                menu(caf);
                break;
            case 6:
                System.out.println("Seguro que desea salir? S/N");
                String op2=leer.next();
                    switch (op2) {
                        case "s":
                            System.out.println("Hasta el próximo café!");
                            break OUTER;
                        case "n":
                            menu(caf);
                            break OUTER;
                        default:
                            System.out.println("Opción incorrecta, intente nuevamente.");
                            menu(caf);
                            break;
                    }
                
            default:
                System.out.println("Opción inválida, intente nuevamente");
                menu(caf);
                break;
            }
    }
}
