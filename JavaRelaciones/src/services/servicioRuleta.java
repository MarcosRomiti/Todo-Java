/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Juego;
import entities.Jugador;
import entities.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class servicioRuleta {
    
    
    public Revolver llenarRevolver(){
        int pos = (int)(Math.random()*6+1);
        int agua= (int)(Math.random()*6+1);
        
        return new Revolver(pos, agua);
    }
    
    public boolean mojar(int pos, int agua, boolean mojado){
        if (pos==agua) {
            mojado = true;
        }
        return mojado;
    }
    
    public int siguienteRecamara(int pos){
        pos++;
        if (pos==7) {
            pos=1;
        }
        return pos;
    }
    
    public boolean disparo(Revolver r1, Jugador j1){
        boolean boo=mojar(r1.getPosAct(),r1.getPosAgua(), j1.isMojado());
        
        if (boo==false) {
            r1.setPosAct(siguienteRecamara(r1.getPosAct()));
        }
        return boo;
    }
    
    public Juego alistarJuego(){
        Scanner leer = new Scanner(System.in);
        boolean boo=true;
        int c=1;
        ArrayList<Jugador> jugadores=new ArrayList();
        Revolver r1=llenarRevolver();
        System.out.println("Alistemos a los jugadores: ");
        while (boo) {
            Jugador j1 = new Jugador();
            System.out.println("Nombre jugador " + c + ": ");
            j1.setNombre(leer.next());
            j1.setMojado(false);
            j1.setId(c);
            jugadores.add(j1);
            if (c==6) {
                boo=false;
            }
            if (c > 1 && c<6) {
                String op = "";
                while (!op.equals("s") && !op.equals("n")) {
                    System.out.println("Añadir otro jugador? s/n");
                    op = leer.next();
                    if (op.equals("n")) {
                        boo = false;
                    } else if (!op.equals("s") && !op.equals("n")) {
                        System.out.println("Opción incorrecta");
                    }
                }
            }
            c++;
        }
        return new Juego(jugadores, r1);
    }
    
    public void ronda(ArrayList<Jugador> j1, Revolver r1){
        Scanner leer = new Scanner(System.in);
        boolean boo=true;
        do {    
        for (Jugador jugador : j1) {
            
            System.out.println("Jugador "+jugador.getId()+" "+jugador.getNombre()+" presione el gatillo (Enter)");
            leer.nextLine();
            jugador.setMojado(disparo(r1, jugador));
            if (jugador.isMojado()) {
                System.out.println("Game over!");
                boo=false;
                break;
            }else{
                System.out.println("Te salvaste! Hasta ahora..");
            }
        }
        } while (boo);
        for (Jugador jugador : j1) {
            if (jugador.isMojado()) {
                System.out.println("Jugador "+jugador.getId()+" "+jugador.getNombre()+" ha perdio");
            }
        }
    }
    
}
