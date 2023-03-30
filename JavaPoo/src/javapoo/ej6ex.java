/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapoo;

import entidades.ahorcado;
import servicios.servicioAhorcado;

/**
 *
 * @author Marcos
 */
public class ej6ex {
    public static void main(String[] args) {
        servicioAhorcado sa=new servicioAhorcado();
        ahorcado juego=sa.crearJuego();
        sa.longitud(juego.getLogitud());
        sa.juego(juego.getLogitud(), juego.getJugadas(), juego.getPalabra());
    }
}
