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
public class caballo extends animal{

    public caballo() {
    }

    public caballo(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void hacerRuido() {
        System.out.println("iiijjjjjj prrrfff");
    }

    @Override
    public animal interfazDePrueba() {
        return new caballo();
    }
    
    @Override
    public void alimento() {
        System.out.println(super.nombre+" se alimenta de "+super.alimento);
    }
}
