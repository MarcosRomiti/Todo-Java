/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapoo;

import entidades.NIF;
import java.util.Scanner;
import servicios.servicioNIF;

/**
 *
 * @author Marcos
 */
public class ej4ex {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        servicioNIF sn=new servicioNIF();
        System.out.println("-Vamos a calcular el NIF de tu DNI-");
        NIF n=sn.crearnif();
        sn.imprimirnif(n.getDni(), n.getNif());
    }
}
