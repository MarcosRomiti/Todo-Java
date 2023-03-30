/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapoo;

import entidades.Matematica;
import servicios.servicioMatematica;

/**
 *
 * @author Marcos
 */
public class ej9 {
    public static void main(String[] args) {
        servicioMatematica sm= new servicioMatematica();
        Matematica m1=new Matematica();
        m1.setNum1(Math.random()*(100-0)+0);
        m1.setNum2(Math.random()*(100-0)+0);
        System.out.println(m1.getNum1()+" "+m1.getNum2());
        double may=sm.devolverMayor(m1.getNum1(), m1.getNum2());
        double men=sm.devolverMenor(m1.getNum1(), m1.getNum2());
        int mayor=(int)Math.round(may);
        int menor=(int)Math.round(men);
        sm.calcularPotencia(mayor, menor);
        sm.calcularRaiz(men);
    }   
}
