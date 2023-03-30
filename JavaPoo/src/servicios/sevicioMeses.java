/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.meses;
import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class sevicioMeses {
    
    public meses setearMeses(){
        String[] meses= new String[12];
        meses[0]="enero";
        meses[1]="febrero";
        meses[2]="marzo";
        meses[3]="abril";
        meses[4]="mayo";
        meses[5]="junio";
        meses[6]="julio";
        meses[7]="agosto";
        meses[8]="septiembre";
        meses[9]="octubre";
        meses[10]="noviembre";
        meses[11]="diciembre";
        String ms=meses[(int)(Math.random()*11+1)];
        return new meses(meses, ms);
    }
    
    public void adivinar(String[] m, String ms){
        Scanner leer = new Scanner(System.in);
        boolean boo=false;
        System.out.println("A ver si adivinás el mes secreto!");
        System.out.print("Cual crees que es el mes secreto? ");
        do {    
            String e=leer.next();
            
            if (e.equals(m[0])||e.equals(m[1])||e.equals(m[2])||e.equals(m[3])||e.equals(m[4])||e.equals(m[5])||e.equals(m[6])||e.equals(m[7])||e.equals(m[8])||e.equals(m[9])||e.equals(m[10])||e.equals(m[11])){
                if (e.equals(ms)) {
                
                    System.out.println("Correcto! el mes era "+e);
                    boo=true;
                }else{ 
                    System.out.print("Incorrecto, intentelo nuevamente: ");
                }
            }else{
                System.out.print("Redacción erronea, intente nuevamente: ");
            }
        }while (boo==false);
        
    }
}
