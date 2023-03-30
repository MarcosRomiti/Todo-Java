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
public class perrera {
    private ArrayList<persona> personas;
    private ArrayList<Perro> perros;
    private ArrayList<Perro> perrosAdoptados;

    public perrera() {
    }

    public perrera(ArrayList<persona> personas, ArrayList<Perro> perros, ArrayList<Perro> perrosAdoptados) {
        this.personas = personas;
        this.perros = perros;
        this.perrosAdoptados = perrosAdoptados;
    }

    public ArrayList<persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<persona> personas) {
        this.personas = personas;
    }

    public ArrayList<Perro> getPerros() {
        return perros;
    }

    public void setPerros(ArrayList<Perro> perros) {
        this.perros = perros;
    }

    public ArrayList<Perro> getPerrosAdoptados() {
        return perrosAdoptados;
    }

    public void setPerrosAdoptados(ArrayList<Perro> perrosAdoptados) {
        this.perrosAdoptados = perrosAdoptados;
    }
    
    
}
