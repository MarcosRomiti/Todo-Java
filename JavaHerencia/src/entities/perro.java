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
public class perro extends animal{

    public perro() {
    }

    public perro(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void hacerRuido() {
        System.out.println("guau");
    }

    @Override
    public animal interfazDePrueba() {
        return new perro();
    }

    @Override
    public void alimento() {
        System.out.println("A "+super.nombre+" le encanta las "+super.alimento);
    }

    
    
}
