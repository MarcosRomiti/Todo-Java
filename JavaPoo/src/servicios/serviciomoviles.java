/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.moviles;
import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class serviciomoviles {
    Scanner leer = new Scanner(System.in);
    
    private int cantidad;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public moviles crearMovil(){
        System.out.println("Ingrese marca");
        String marca=leer.next();
        System.out.println("Ingrese modelo");
        String modelo=leer.next();
        System.out.println("Ingrese cantidad de ram");
        int ram=leer.nextInt();
        System.out.println("Ingrese cantidad almacenamiento interno");
        int almInt=leer.nextInt();
        System.out.println("Ingrese precio");
        int precio=leer.nextInt();
        System.out.println("Ingrese código");
        int[] codigo=new int[7];
        for (int i = 0; i < 7; i++) {
            codigo[i]=leer.nextInt();
        }
        return new moviles(marca, modelo, ram, almInt, precio, codigo);
    }

}
