/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Asiento;
import entities.Espectador;
import entities.Pelicula;
import entities.Sala;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class servicioSala {
    Scanner leer = new Scanner(System.in); 
    
    public ArrayList<Espectador> crearEspectadores(){
        ArrayList<Espectador> espectadores=new ArrayList();
        int c=1;
        for (int i = 0; i < 50; i++) {
            int rndm = (int)(Math.random()*100+1);
            if (rndm>50) {
                Espectador e1 = new Espectador();
                e1.setNombre("Espectador "+c);
                e1.setEdad((int)(Math.random()*80+8));
                e1.setDinero((int)(Math.random()*5000+300));
                espectadores.add(e1);
                c++;
            }
        }
        
        return espectadores;
    }
    
    public Pelicula crearPelicula(){
        System.out.print("Título: ");
        String titulo = leer.next();
        System.out.print("Duración: ");
        int dur = leer.nextInt();
        System.out.print("Edad mínima de ingreso: ");
        int edad = leer.nextInt();
        System.out.print("Valor de la entrada: ");
        int val = leer.nextInt();
        return new Pelicula(titulo, dur, edad, val);
    }
    
    public ArrayList<Asiento> crearAsientos(){
        int c=0;
        int c2=8;
        String l= "A";
        ArrayList<Asiento> asientos = new ArrayList();
        for (int i = 0; i <48 ; i++) {
            Asiento a1=new Asiento();
            switch (c) {
                case 0:
                    l="A";
                    break;
                case 1:
                    l="B";
                    break;
                case 2:
                    l="C";
                    break;
                case 3:
                    l="D";
                    break;
                case 4:
                    l="E";
                    break;
                case 5:
                    l="F";
                    break;
            }
            c++;
            a1.setNumero(c2);
            a1.setLetra(l);
            a1.setOcupado(false);
            a1.toString();
            if (c==6) {
                c=0;
                c2--;
            }
            asientos.add(a1);
            
        }
        
        return asientos;
    }
    
    public Sala asignarAsientos(Sala sala){
        int c=0;
        do {
            for (Espectador object : sala.getEspectadores()) {
                if (object.getDinero()>=sala.getPeli().getValorBoleto()&&object.getEdad()>=sala.getPeli().getEdadMin()) {
                    for (Asiento object1 : sala.getAsientos()) {
                        if (object1.isOcupado()==false) {
                                object1.setOcupado(true);
                                break;
                            }else if(object1.isOcupado()==true){
                                continue;
                            }
                    }
                }
                c++;
            }
        } while (c<sala.getEspectadores().size());
        return sala;
    }
    
    public void mostrarSala(Sala sala){
        for (Espectador object : sala.getEspectadores()) {
            System.out.println(object.toString());
        }
        ArrayList<Asiento> asientos=new ArrayList(sala.getAsientos());
        for (Asiento object : asientos) {
            String oc=" ";
            if (object.isOcupado()==true) {
                oc="X";
            }
            System.out.print(object.getNumero()+object.getLetra()+oc+"|");
            if (object.getLetra()=="F") {
                System.out.println("\n");
                
            }
        }
    }
}
