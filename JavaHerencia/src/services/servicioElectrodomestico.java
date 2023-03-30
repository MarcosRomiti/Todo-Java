/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.electrodomestico;
import entities.lavadora;
import entities.televisor;
import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class servicioElectrodomestico {
    Scanner leer = new Scanner(System.in);
    
    public electrodomestico crearElectrodomestico(){
        System.out.println("Ingrese las características del electrodoméstico:");
        System.out.print("Consumo: ");
        char consumo = leer.next().toUpperCase().charAt(0); 
        System.out.print("Color: ");
        String color=leer.next().toLowerCase();
        System.out.print("Peso: ");
        int peso = leer.nextInt();
        int precio=1000;
        
        return new electrodomestico(precio, color, consumo, peso);
    }
    
    public lavadora crearLavadora(){
        electrodomestico e=crearElectrodomestico();
        System.out.print("Carga: ");
        int carga = leer.nextInt();
        e.setConsumo(comprobarConsumo(e.getConsumo(),e.getCharConsumo()));
        e.setColor(comprobarColor(e.getColor(),e.getCharColores()));
        e.setPrecio(precioFinal(e.getPeso(), e.getPrecio(), e.getConsumo()));
        
        return new lavadora(carga, e.getPrecio(), e.getColor(), e.getConsumo(), e.getPeso());
    }
    
    public lavadora crearYsetearPrecioLavadora(){
        lavadora l=crearLavadora();
        l.setPrecio(l.calculoPrecio(l.getPrecio(), l.getCarga(), false));
        return l;
    }
    
    public int precioFinal(int peso, int precio, char co){
        switch (co) {
            case 'A':
                precio=precio+1000;
                break;
            case 'B':
                precio=precio+800;
                break;
            case 'C':
                precio=precio+600;
                break;
            case 'D':
                precio=precio+500;
                break;
            case 'E':
                precio=precio+300;
                break;
            case 'F':
                precio=precio+100;
                break;
        }
        
        if (peso>=1&&peso<=19) {
            precio=precio+100;
        }else if(peso>=20&&peso<=49){
            precio=precio+500;
        }else if(peso>=50&&peso<=79){
            precio=precio+800;
        }else if(peso>=80){
            precio=precio+1000;
        }
            
        return precio;
    }
    
    public char comprobarConsumo(char c, char[] co){
        int f=0;
        for (int i = 0; i < 6; i++) {
            if (c!=co[i]) {
                f++;
            }
        }
        if (f==6) {
            c='F';
        }
        return c;
    }
    
    public String comprobarColor(String c,CharSequence[] co){
        int f=0;
        for (int i = 0; i < 5; i++) {
            if (!c.equals(co[i])) {
                f++;
            }
        }
        if (f==5) {
            c="blanco";
        }
        return c;
    }
    
    public televisor crearTelevisor(){
        electrodomestico e=crearElectrodomestico();
        System.out.print("Tamaño en pulgadas: ");
        int tamaño = leer.nextInt();
        System.out.print("Tiene sintonizador TDT? S/N ");
        String op = leer.next().toLowerCase();
        boolean tdt=false;
        if (op.equals("s")) {
            tdt=true;
        } 
        e.setConsumo(comprobarConsumo(e.getConsumo(),e.getCharConsumo()));
        e.setPrecio(precioFinal(e.getPeso(), e.getPrecio(), e.getConsumo()));
        e.setColor(comprobarColor(e.getColor(),e.getCharColores()));
        return new televisor(tdt, tamaño, e.getPrecio(), e.getColor(), e.getConsumo(), e.getPrecio());
    }
    
    public televisor crearYsetearCosasTelevisor(){
        televisor t=crearTelevisor();
        t.setPrecio(t.calculoPrecio(t.getPrecio(), t.getTamaño(), t.isTdt()));
        return t;
    }
}
