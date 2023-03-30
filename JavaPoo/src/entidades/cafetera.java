/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class cafetera {
    //ejercicio 6
    private int capMax=2000;
    private int capAct;

    public cafetera() {
    }

    public cafetera(int capMax, int capAct) {
        this.capMax = capMax;
        this.capAct = capAct;
    }

    public int getCapMax() {
        return capMax;
    }

    public void setCapMax(int capMax) {
        this.capMax = capMax;
    }

    public int getCapAct() {
        return capAct;
    }

    public void setCapAct(int capAct) {
        this.capAct = capAct;
    }
    
    public int llenar(int capMax,int capAct) {
        System.out.println(capMax);
        capAct=capMax;
        return capAct;
    }
    public int servir(int capAct){
        Scanner leer = new Scanner(System.in);
        System.out.println("Indique el contenido a agregar a la taza:");
        int cant=leer.nextInt();
        
        if (cant<capAct) {
            System.out.println("Disfrute su café");
            capAct=capAct-cant;
        }else{
            System.out.println("La cantidad de café que contenía la máquina no llegaba a la indicada");
            System.out.println("Se ha servido la cantidad de "+capAct+"g de café");
            capAct=0;
        }
    return capAct;    
        
    }
    public int vaciar(int capAct) {
        capAct=0;
        System.out.println("Se ha vaciado la cafetera.");
        return capAct;
    }
    public int ingresar(int capAct, int caMax) {
        Scanner leer = new Scanner(System.in);
        int n=leer.nextInt();
        if (n<=capMax) {
            capAct=capAct+n;
            System.out.println("Se ha agregado café a la cafetera.");
        System.out.println("La cantidad actual en el depósito es "+capAct+"g de café");
        }else{
            System.out.println("La cantidad indicada excede el máximo del depósito");
        }
        
        return capAct;
    }
}
