/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarelaciones;

import entities.Perro;
import entities.perrera;
import entities.persona;
import java.util.ArrayList;
import java.util.Scanner;
import services.servicioAdopcion;

/**
 *
 * @author Marcos
 */
public class ej1ex {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        servicioAdopcion sa=new servicioAdopcion();
        perrera perre=new perrera();
        ArrayList<persona> personas = new ArrayList();
        ArrayList<Perro> perros = sa.crearPerros();
        ArrayList<Perro> perrosAdoptados = new ArrayList();
        perre.setPersonas(personas);
        perre.setPerros(perros);
        perre.setPerrosAdoptados(perrosAdoptados);
        persona per = new persona();
        boolean boo1=true;
        int op;
        while (boo1) {
        System.out.println("~Servicio de adpmpción de perros~");
        System.out.println("Desea registarse (1) o salir? (2)");
        op=leer.nextInt();
            switch (op) {
                case 1:
                    per=sa.crearPersonas();
                    perre.getPersonas().add(per);
                    menu(sa, perre, per);
                    break;
                case 2:
                    System.out.println("Hasta la próxima!");
                    boo1=false;
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        
        }
        }
    
    public static void menu(servicioAdopcion sa, perrera perre, persona per){
        Scanner leer = new Scanner(System.in);
        boolean boo;
        String op2;
        boo=true;
        
        while (boo) {
        System.out.println("Bienvenido "+per.getNombre()+"\n"
                + "\n"
                + "-Elija una opción-\n"
                + "1: Mostrar lista de perros en adopción \n"
                + "2: Buscar perro por nombre \n"
                //+ "3: Buscar perro por raza \n"
                + "3: Mostrar perros ya adoptados \n"
                + "4: Salir");
        int op = leer.nextInt();
        switch (op) {
            case 1:
                sa.mostrarPerros(perre.getPerros());
                menu(sa, perre, per);
                break;
            case 2:
                System.out.println("Como se llama el perrito que le interesó?");
                String n=leer.next();
                perre=sa.buscarPorNombre(n, per, perre);
                menu(sa, perre, per);
                break;
            /*case 3:
                System.out.println("Que raza le interesa?");
                String m=leer.next();
                perre=sa.buscarPorRaza(m, per, perre);
                menu(sa, perre);
                break;*/
            case 3:
                sa.mostrarPerros(perre.getPerrosAdoptados());
                menu(sa, perre, per);
                break;
            case 4:
                do{
                System.out.println("¿Seguro que desea terminar?");
                op2=leer.next();
                if (op2.equals("s")) {
                    boo=false;
                    System.out.println("Hasta la próxima adopción!");
                    break;
                }else if(op2.equals("n")){
                    menu(sa, perre, per);
                    break;
                }else{
                    System.out.println("Opción inválida 1");
                    break;
                }
                }while(!op2.equals("s")||!op2.equals("n"));
                break;
            default:
                System.out.println("Opción inválida 2");
                menu(sa, perre, per);    
                break;
        }
        }
        
    }
}
