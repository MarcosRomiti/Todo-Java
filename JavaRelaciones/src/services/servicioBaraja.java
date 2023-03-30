/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Baraja;
import entities.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;


/**
 *
 * @author Marcos
 */
public class servicioBaraja {
    
    public ArrayList<Carta> crearBaraja(){
        ArrayList<Carta> baraja = new ArrayList();
        int k=0;
        String p="Espada";
        for (int i = 1; i < 11; i++) {
            Carta c = new Carta();
            int l=i;
            
            if (i==8) {
                l=10;
            }else if(i==9){
                l=11;
            }else if(i==10){
                l=12;
                i=0;
            }
            switch (k) {
                case 10:
                    p="Basto";
                    break;
                case 20:
                    p="Oro";
                    break;
                case 30:
                    p="Copa";
                    break;
                case 39:
                    i=10;
                default:
                    break;
            }
            c.setNumero(l);
            c.setPalo(p);
            baraja.add(c);
            k++;
            
        }
        return baraja;
    }
    
    public void mostrarBaraja(ArrayList<Carta> b){
        if (b.size()==0) {
            System.out.println("No hay cartas aquí.");
        }else if(b.size()>0){
            System.out.println(" ");
        for (Object aux : b) {
            System.out.println(aux.toString());
        }
        }
        System.out.println(" ");
    }
    
    public ArrayList<Carta> barajar(ArrayList<Carta> b1){
        Collections.shuffle(b1);
        return b1;
    }
    
    public void siguienteCarta(ArrayList<Carta> b1, ArrayList<Carta> b2, Baraja b){
        if (b1.size()==0) {
            System.out.println("No hay cartas aquí.");
        }else if(b.getBaraja().size()>0){    
        Iterator it=b1.iterator();
        Carta c=(Carta)it.next();
        System.out.println(c);
        while (it.hasNext()) {
            if (b1.contains(c)) {
                it.remove();
                break;
            }
        }
        b2.add(c);
        b.setBaraja(b1);
        b.setMonton(b2);
        }
    }
    
    public void darCartas(Baraja b){
        Scanner leer = new Scanner(System.in);
        if (b.getBaraja().size()==0) {
            System.out.println("No hay cartas aquí.");
        }else if(b.getBaraja().size()>0){
        System.out.println("Cuantas cartas desea?");
        int c= leer.nextInt();
            if (b.getBaraja().size()<c) {
                System.out.println("Solo hay disponibles "+b.getBaraja().size()+" cartas, aquí las tiene:");
                c=b.getBaraja().size();
            }else if(b.getBaraja().size()==1){
                 System.out.println("Solo hay disponible una carta, aquí la tiene:");
                 c=1;
            }else{
            System.out.println("Aquí tiene sus cartas:");
            }
        for (int i = 0; i < c; i++) {
            siguienteCarta(b.getBaraja(), b.getMonton(), b);
        }
        }
        if(b.getBaraja().size()==1){
            for (Carta carta : b.getBaraja()) {
                b.getMonton().add(carta);
            }
            b.getBaraja().clear();
            b.setBaraja(b.getBaraja());
            }
    }
    
    public void cartasDisponibles(ArrayList<Carta> b1){
        if (b1.size()==0) {
            System.out.println("No hay cartas aquí.");
        }else if(b1.size()>0){
            System.out.println("Las cartas disponibles son: "+b1.size());
        }
    }
}
