/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarelaciones;

import entities.Baraja;
import entities.Carta;
import java.util.ArrayList;
import java.util.Scanner;
import services.servicioBaraja;

/**
 *
 * @author Marcos
 */
public class ej3 {
    
    Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args) {
        servicioBaraja sb=new servicioBaraja();
        Baraja baraja =new Baraja();
        ArrayList<Carta> b=sb.crearBaraja();
        ArrayList<Carta> m=new ArrayList();
        baraja.setBaraja(b);
        baraja.setMonton(m);
        System.out.println("..-*Juego de cartas Java*-..");
        menu(baraja, sb);
        /*
        sb.mostrarBaraja(baraja.getBaraja());
        sb.barajar(baraja.getBaraja());
        sb.mostrarBaraja(baraja.getBaraja());
        System.out.println("Siguiente carta");
        sb.siguienteCarta(b, m, baraja);
        sb.mostrarBaraja(baraja.getBaraja());
        sb.mostrarBaraja(baraja.getMonton());
        sb.darCartas(baraja);
        sb.mostrarBaraja(baraja.getBaraja());
        sb.mostrarBaraja(baraja.getMonton());
        */
    }
    
    public static void menu(Baraja baraja, servicioBaraja sb){
        Scanner leer = new Scanner(System.in);
        System.out.println("-Elija una opción- \n"
                + "1: Mostrar maso \n"
                + "2: Mostrar monton \n"
                + "3: Cartas disponibles en el maso\n"
                + "4: Barajar \n"
                + "5: Dar siguiente carta \n"
                + "6: Dar X cantidad de cartas \n"
                + "7: Salir \n");
        int op=leer.nextInt();
        switch (op) {
            case 1:
                System.out.println("Mostrando baraja");
                sb.mostrarBaraja(baraja.getBaraja());
                menu(baraja, sb);
                break;
            case 2:
                
                if(baraja.getMonton().size()>0){
                System.out.println("\n"
                        + "Mostrando montón \n"
                        + " ");
                sb.mostrarBaraja(baraja.getMonton());
                }else{
                    System.out.println("\n"
                            + "No hay cartas aquí \n"
                            + "");
                }
                
                menu(baraja, sb);
                break;
            case 3:
                sb.cartasDisponibles(baraja.getBaraja());
                menu(baraja, sb);
                break;
            case 4:
                System.out.println("Barajando");
                baraja.setBaraja(sb.barajar(baraja.getBaraja()));
                menu(baraja, sb);
                break;
            case 5:
                System.out.println("Siguiente carta");
                sb.siguienteCarta(baraja.getBaraja(), baraja.getMonton(), baraja);
                menu(baraja, sb);
                break;
            case 6:
                sb.darCartas(baraja);
                menu(baraja, sb);
                break;
            case 7:
                System.out.println("Seguro que desea salir? S/N");
                String op2=leer.next();
                    switch (op2) {
                        case "s":
                            System.out.println("Saliendo...");
                            System.exit(0);
                        case "n":
                            menu(baraja, sb);
                            break;
                        default:
                            System.out.println("Opción incorrecta, intente nuevamente.");
                            menu(baraja, sb);
                            break;
                    }
                   
            default:
                System.out.println("Opción incorrecta, intente nuevamente.");
                            menu(baraja, sb);
                            break;
        }
        
    }
}
