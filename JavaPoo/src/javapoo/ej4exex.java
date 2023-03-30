/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapoo;

import entidades.fecha;
import servicios.servicioFecha;

/**
 *
 * @author Marcos
 */
public class ej4exex {
    public static void main(String[] args) {
        servicioFecha sf= new servicioFecha();
        fecha f1 =  new fecha();
        
        f1 = sf.verificar(f1.getDia(), f1.getMes(), f1.getAño());
        
        System.out.println(f1.toString());
       
        sf.diasTotales(f1.getMes(),f1.getAño(), f1.getDia());
        
        sf.diaAnterior(f1.getAño(), f1.getMes(), f1.getDia());
        
        sf.diaPosterior(f1.getAño(), f1.getMes(), f1.getDia());
  
    }
    
}

}
