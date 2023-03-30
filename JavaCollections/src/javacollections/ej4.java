/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollections;

import entities.pelicula;
import java.util.ArrayList;
import services.servicioPelicula;

/**
 *
 * @author Marcos
 */
public class ej4 {
    public static void main(String[] args) {
        servicioPelicula sp=new servicioPelicula();
        ArrayList<pelicula> peList=sp.crearPelicula();
        sp.mostrarPelis(peList);
        sp.mostrarPelisMasUnaHora(peList);
        sp.mostrarPelisOrdenadasPorDuracion(peList);
        sp.mostrarPelisOrdenadasPorDuracionInverso(peList);
        sp.mostrarPelisOrdenadasPorTitulo(peList);
        sp.mostrarPelisOrdenadasPorDirector(peList);
    }
}
