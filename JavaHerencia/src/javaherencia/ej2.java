/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaherencia;

import entities.lavadora;
import entities.televisor;
import services.servicioElectrodomestico;

/**
 *
 * @author Marcos
 */
public class ej2 {
    public static void main(String[] args) {
        servicioElectrodomestico se=new servicioElectrodomestico();
        System.out.println("Crearemos una lavadora");
        lavadora la=se.crearYsetearPrecioLavadora();
        System.out.println("Ahora un televisor");
        televisor te=se.crearYsetearCosasTelevisor();
        System.out.println("El precio final de la lavadora es de $"+la.getPrecio());
        System.out.println("El precio final del televisor es de $"+te.getPrecio());
        
    }
}
