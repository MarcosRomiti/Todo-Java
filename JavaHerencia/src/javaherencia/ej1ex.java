/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaherencia;

import entities.alquiler;
import java.util.ArrayList;
import java.util.Scanner;
import services.servicioAmarre;

/**
 *
 * @author Marcos
 */
public class ej1ex {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        servicioAmarre sa=new servicioAmarre();
        alquiler alq=sa.preAlquiler();
        System.out.println("El precio del alquiler será: "+alq.getPrecioAlquiler());
        ArrayList<alquiler> alqlis=new ArrayList();
        alqlis.add(alq);
        alquiler alq1=sa.preAlquiler();
        alqlis.add(alq1);
        for (alquiler alqli : alqlis) {
            System.out.println(alqli.toString());
        }
    }
}
