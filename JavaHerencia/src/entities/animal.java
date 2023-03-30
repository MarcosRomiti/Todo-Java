/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import interfaces.interfacePrueba;

/**
 *
 * @author Marcos
 */
public abstract class animal implements interfacePrueba{
    
    protected String nombre;
    protected String alimento;
    protected int edad;
    protected String raza;

    public animal(String nombre, String alimento, int edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }

    public animal() {
    }
    
    public abstract void alimento();
    
    public abstract void hacerRuido();

    @Override
    public abstract animal interfazDePrueba();
            
}
