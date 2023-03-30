/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarelaciones;

import entities.Juego;
import services.servicioRuleta;

/**
 *
 * @author Marcos
 */
public class ej2 {
    public static void main(String[] args) {
        servicioRuleta sr= new servicioRuleta();
        Juego juego=sr.alistarJuego();
        sr.ronda(juego.getJugadores(), juego.getRevolver());
    }
}
