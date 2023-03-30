/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarelaciones;

import entities.Asiento;
import entities.Espectador;
import entities.Pelicula;
import entities.Sala;
import java.util.ArrayList;
import services.servicioSala;

/**
 *
 * @author Marcos
 */
public class ej2ex {
    public static void main(String[] args) {
        servicioSala ss= new servicioSala();
        ArrayList<Asiento> asientos = ss.crearAsientos();
        ArrayList<Espectador> espectadores=ss.crearEspectadores();
        Pelicula p1 = ss.crearPelicula();
        Sala sala = new Sala();
        sala.setAsientos(asientos);
        sala.setEspectadores(espectadores);
        sala.setPeli(p1);
        sala=ss.asignarAsientos(sala);
        ss.mostrarSala(sala);
        System.out.println("fin");
    }
}
