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
public class Baraja {
    
    private ArrayList<Carta> baraja;
    private ArrayList<Carta> monton;
    
    public ArrayList<Carta> getBaraja() {
        return baraja;
    }

    public void setBaraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }

    public ArrayList<Carta> getMonton() {
        return monton;
    }

    public void setMonton(ArrayList<Carta> monton) {
        this.monton = monton;
    }

    public Baraja(ArrayList<Carta> baraja, ArrayList<Carta> monton) {
        this.baraja = baraja;
        this.monton = monton;
    }

    public Baraja() {
    }

    
    
    
}
