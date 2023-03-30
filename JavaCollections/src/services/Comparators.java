/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.pais;
import entities.pelicula;
import java.util.Comparator;

/**
 *
 * @author Marcos
 */
public class Comparators {
     public static Comparator<pelicula> compararDuracion = new Comparator<pelicula>() {
         @Override
         public int compare(pelicula t, pelicula t1) {
             return t.getDuracion().compareTo(t1.getDuracion());
         }
     };

     public static Comparator<pelicula> compararDuracionInverso = new Comparator<pelicula>() {
         @Override
         public int compare(pelicula t, pelicula t1) {
             return t1.getDuracion().compareTo(t.getDuracion());
         }
     };
     
     public static Comparator<pelicula> compararTitulo = new Comparator<pelicula>() {
         @Override
         public int compare(pelicula t, pelicula t1) {
             return t.getTitulo().compareTo(t1.getTitulo());
         }
     };
     
     public static Comparator<pelicula> compararDirector = new Comparator<pelicula>() {
         @Override
         public int compare(pelicula t, pelicula t1) {
             return t.getDirector().compareTo(t1.getDirector());
         }
     };
     
     public static Comparator<pais> compararPaises = new Comparator<pais>() {
         @Override
         public int compare(pais t, pais t1) {
             return t.getNombre().compareTo(t1.getNombre());
         }
     };
}
