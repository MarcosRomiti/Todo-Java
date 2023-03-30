/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.fecha;
import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class servicioFecha {


    Scanner leer = new Scanner(System.in);

    public fecha verificar(int dia, int mes, int año) {

      
    }
    public void diasTotales(int mes, int año, int dia) {

        switch (mes) {
            case 1:
                System.out.println("Enero tiene 31 dias");
                break;
            case 2:
                if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0))) {
                    System.out.println("Febrero tiene 29 dias");
                    if (dia > 29) {
                        System.out.println("Error");
                        System.exit(0);
                        }
                } else {
                    System.out.println("Febrero tiene 28 días");
                } if (dia > 28) {
                        System.out.println("Error");
                        System.exit(0);
                        }
                break;
            case 3:
                System.out.println("Marzo tiene 31 dias");
                break;
            case 4:
                System.out.println("Abril tiene 30 dias");
                break;
            case 5:
                System.out.println(

}
    
}
public void diaPosterior(int año, int mes, int dia) {

        if (año == 1900 && mes == 1 && dia == 1) {
            System.out.println("_______________");

        } else {
           
    
            if ((dia == 31 && mes == 1 )||(dia == 31 &&  mes == 3) ||(dia == 31 &&  mes == 5) ||(dia == 31 &&  mes == 7) ||(dia == 31 &&  mes == 8 )||(dia == 31 &&  mes == 10 )||(dia == 31 &&  mes == 12)) {
                dia = 1;
                mes = mes + 1; 
            }
            else if ((dia == 30 && mes == 4 )|| (dia == 30 && mes == 6 )|| (dia == 30 && mes == 9 )||(dia == 30 &&  mes == 11)) {
                dia = 1;
                mes = mes + 1;
            }
            
            else if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0)) && mes == 2) {
                dia = 1;
                dia = mes + 1;
            } else {
                dia = dia + 1;
            }
                
            if (mes == 13) {

                mes = 1;
            }
        }
 }
    