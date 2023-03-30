/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;

/**
 *
 * @author Marcos
 */
public class Sala {
    private ArrayList<Asiento> asientos;
    private ArrayList<Espectador> espectadores;
    private Pelicula peli;

    public Sala() {
    }

    public Sala(ArrayList<Asiento> asientos, ArrayList<Espectador> espectadores, Pelicula peli) {
        this.asientos = asientos;
        this.espectadores = espectadores;
        this.peli = peli;
    }

    public ArrayList<Asiento> getAsientos() {
        return asientos;
    }

    public void setAsientos(ArrayList<Asiento> asientos) {
        this.asientos = asientos;
    }

    public ArrayList<Espectador> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(ArrayList<Espectador> espectadores) {
        this.espectadores = espectadores;
    }

    public Pelicula getPeli() {
        return peli;
    }

    public void setPeli(Pelicula peli) {
        this.peli = peli;
    }
    
    
}
