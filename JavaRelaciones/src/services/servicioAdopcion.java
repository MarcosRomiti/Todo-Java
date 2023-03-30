/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Perro;
import entities.persona;
import java.util.ArrayList;
import entities.dni;
import entities.perrera;
import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class servicioAdopcion {
    
    Scanner leer = new Scanner(System.in);
    
    public persona crearPersonas(){
        ArrayList<persona> personas = new ArrayList();
        System.out.print("\n"
                + "Ingrese su nombre: ");
        String nombre= leer.next();
        System.out.print("Ingrese su apellido: ");
        String apellido= leer.next();
        System.out.print("Ingrese su DNI: ");
        int dni = leer.nextInt();
        System.out.println(" ");
        return new persona(nombre,apellido,crearDni(dni));
    }
    
    public dni crearDni(int i){
        dni Dni=new dni(i);
        return Dni;
    }
    
    public ArrayList<Perro> crearPerros(){
        ArrayList<Perro> perros = new ArrayList();
        perros.add(new Perro("Chiquito","callejero",1));
        perros.add(new Perro("Chiquita","caniche",1));
        perros.add(new Perro("Lola","callejera",2));
        perros.add(new Perro("Pepo","doberman",3));
        return perros;
    }
    
    public void mostrarPerros(ArrayList p){
        for (Object object : p) {
            System.out.println(object.toString());
        }
    }
    
    public perrera buscarPorNombre(String n, persona per, perrera p){
        int c=0;
        if (p.getPerros().size()==0) {
            System.out.println("No hay perros en adopción.");
        }else if(p.getPerros().size()>0){    
            for (Perro perro : p.getPerros()) {
                if (perro.getNombre().equals(n)) {
                    System.out.println("Hay un perrito para adoptar con ese nombre \n"
                            + " es raza "+perro.getRaza()+" y tiene "+perro.getEdad()+" años \n"
                                    + "Que disfrute con su nuevo perrito!");
                    p.getPerrosAdoptados().add(perro);
                    p.getPerros().remove(perro);
                    p.getPerros().trimToSize();
                    for (persona object : p.getPersonas()) {
                        if (object.equals(per)) {
                            object.setPerro(perro);
                        }
                    }
                    c++;
                    break;
                }
            }
        }
        if (c==0) {
            for (Perro object : p.getPerrosAdoptados()) {
                if (p.getPerrosAdoptados().contains(object)) {
                    System.out.println("Ese perrito ya fue adoptado."); 
                }
            }
        }
        return p;
    }
    
    /*public perrera buscarPorRaza(String n, persona per, perrera p){
        int c=0;
        if (p.getPerros().size()==0) {
            System.out.println("No hay perros en adopción.");
        }else if(p.getPerros().size()>0){    
            for (Perro perro : p.getPerros()) {
                if (perro.getRaza().equals(n)) {
                    System.out.println("Hay un perrito de esa raza para adoptar \n"
                            + " se llama "+perro.getNombre()+" y tiene "+perro.getEdad()+" años \n"
                                    + "Que disfrute con su nuevo perrito!");
                    p.getPerrosAdoptados().add(perro);
                    p.getPerros().remove(perro);
                    p.getPerros().trimToSize();
                    for (persona object : p.getPersonas()) {
                        if (object.equals(per)) {
                            object.setPerro(perro);
                        }
                    }
                    c++;
                    break;
                }
            }
        }
        if (c==0) {
            for (Perro object : p.getPerrosAdoptados()) {
                if (p.getPerrosAdoptados().contains(object)) {
                    System.out.println("Ese perrito ya fue adoptado."); 
                }
            }
        }
        return p;
    }*/
    
}
