/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Marcos
 */
public class gato extends animal{

    public gato(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    public gato() {
    }
    
    @Override
    public void hacerRuido() {
        System.out.println("miau");
    }

    @Override
    public animal interfazDePrueba() {
        return new gato();
    }

    @Override
    public void alimento() {
        System.out.println(super.nombre+" se alimenta de "+super.alimento);
    }
}
