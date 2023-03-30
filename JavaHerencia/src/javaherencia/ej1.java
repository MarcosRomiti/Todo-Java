/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaherencia;
import java.util.ArrayList;
import entities.animal;
import entities.caballo;
import entities.gato;
import entities.perro;
/**
 *
 * @author Marcos
 */
public class ej1 {
    public static void main(String[] args) {
        ArrayList<animal> animales = new ArrayList();
        animales.add(new perro("Stiche","sobras",10,"callejero"));
        animales.add(new gato("Pelusa", "alimento balanceado", 5, "naranja"));
        animales.add(new caballo("Chispa","alfalfa",12,"Fino"));
        
        for (animal animale : animales) {
            animale.alimento();
        }
    }
}
