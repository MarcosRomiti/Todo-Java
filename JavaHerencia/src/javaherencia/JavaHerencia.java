/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaherencia;
import java.util.ArrayList;
import entities.animal;
import entities.gato;
import entities.perro;

/**
 *
 * @author Marcos
 */
public class JavaHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<animal> animales = new ArrayList();
        //animal a= new animal();
        perro p = new perro();
        //gato g = interfazDePrueba();
        //animales.add(a);
        animales.add(new gato().interfazDePrueba());
        animales.add(p);
        
        for (animal animale : animales) {
            animale.hacerRuido();
        }
        
        
    }
    
}
