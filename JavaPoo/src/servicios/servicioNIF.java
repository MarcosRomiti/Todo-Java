/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class servicioNIF {
    
    public NIF crearnif(){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese su DNI: ");
        int dni=leer.nextInt();
        int n=dni%23;
        String nif="";
        switch (n) {
            case 0:
                nif="T";
                break;
            case 1:
                nif="R";
                break;  
            case 2:
                nif="W";
                break; 
            case 3:
                nif="A";
                break; 
            case 4:
                nif="G";
                break;
            case 5:
                nif="M";
                break; 
            case 6:
                nif="Y";
                break; 
            case 7:
                nif="F";
                break;  
            case 8:
                nif="P";
                break; 
            case 9:
                nif="D";
                break;   
            case 10:
                nif="X";
                break;
            case 11:
                nif="B";
                break; 
            case 12:
                nif="N";
                break;    
            case 13:
                nif="J";
                break; 
            case 14:
                nif="Z";
                break; 
            case 15:
                nif="S";
                break; 
            case 16:
                nif="";
                break;
            case 17:
                nif="V";
                break; 
            case 18:
                nif="H";
                break; 
            case 19:
                nif="L";
                break;  
            case 20:
                nif="C";
                break; 
            case 21:
                nif="K";
                break;
            case 22:
                nif="E";
                break;        
            default:
                System.out.println(n);
        }
        return new NIF(dni, nif);
    }
    
    public void imprimirnif(int dni, String nif){
        System.out.println("El resultado es: "+dni+"-"+nif);
    }
}
