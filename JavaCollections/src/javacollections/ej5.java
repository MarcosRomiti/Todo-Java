/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollections;

import entities.pais;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import services.servicioPais;

/**
 *
 * @author Marcos
 */
public class ej5 {
    public static void main(String[] args) {
        servicioPais sp= new servicioPais();
        Set <pais> paList=sp.crearPaises();
        sp.mostrarPaises(paList);
        LinkedHashSet<pais> paList2=(LinkedHashSet<pais>) sp.mostrarPaisesOrdeALf(paList);
        paList2=(LinkedHashSet<pais>) sp.eliminarPais(paList2);
        sp.mostrarPaises(paList2);
    }
}
