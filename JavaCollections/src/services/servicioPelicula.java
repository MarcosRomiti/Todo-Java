/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class servicioPelicula {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public ArrayList<pelicula> crearPelicula(){
        String titulo, director;
        int duracion, c=0;
        boolean boo=true;
        ArrayList<pelicula> peList=new ArrayList();
        System.out.println("Ingrese las películas y sus datos:");
        while (boo) {
            pelicula peli=new pelicula();
            System.out.print("Título: ");
            peli.setTitulo(leer.nextLine());
            System.out.print("Director: ");
            peli.setDirector(leer.nextLine());
            System.out.print("Duración: ");
            peli.setDuracion(leer.nextInt());
            peList.add(c, peli);
            System.out.println(" ");
            System.out.println("Desea añadir otra película?");
            String op;
            op=leer.next();
            boo=true;
            if (op.equals("s")) {
                c++;
                System.out.println("Ingrese una nueva película:");
            }else if(op.equals("n")){
                boo=false;
            }else{
                System.out.println("Opción incorrecta");
            }
        }
        return peList;
    }
    
    public void mostrarPelis(ArrayList<pelicula> pe){
        System.out.println("----------------------");
        System.out.println("Estas son las pelis en la lista:");
        for (pelicula object : pe) {
            System.out.println(object.toString());
        }
        System.out.println("----------------------");
    }
    
    public void mostrarPelisMasUnaHora(ArrayList<pelicula> pe){
        System.out.println("Estas son las pelis de mas de una hora:");
        for (pelicula object : pe) {
            if (object.getDuracion()>=60) {
            System.out.println(object.toString());
            }
        }
        System.out.println("----------------------");
    }
    
    public void mostrarPelisOrdenadasPorDuracion(ArrayList<pelicula> pe){
        System.out.println("Estas son las pelis en la lista ordenadas por su duración:");
        Collections.sort(pe, Comparators.compararDuracion);
        for (pelicula object : pe) {
            System.out.println(object.toString());
        }
        System.out.println("----------------------");
    }
    
   public void mostrarPelisOrdenadasPorDuracionInverso(ArrayList<pelicula> pe){
        System.out.println("Estas son las pelis en la lista ordenadas por su duración inversa:");
        Collections.sort(pe, Comparators.compararDuracionInverso);
        for (pelicula object : pe) {
            System.out.println(object.toString());
        }
        System.out.println("----------------------");
    }
   
   public void mostrarPelisOrdenadasPorTitulo(ArrayList<pelicula> pe){
        System.out.println("Estas son las pelis en la lista ordenadas por su Titulo:");
        Collections.sort(pe, Comparators.compararTitulo);
        for (pelicula object : pe) {
            System.out.println(object.toString());
        }
        System.out.println("----------------------");
    }
   
   public void mostrarPelisOrdenadasPorDirector(ArrayList<pelicula> pe){
        System.out.println("Estas son las pelis en la lista ordenadas por su director:");
        Collections.sort(pe, Comparators.compararDirector);
        for (pelicula object : pe) {
            System.out.println(object.toString());
        }
        System.out.println("----------------------");
    }
}
