/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapoo;

import entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class ej5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cuenta c1=new Cuenta();
        System.out.println("**Bienvenido, ingrese sus datos**");
        System.out.print("Número de cuenta: ");
        c1.setNumCuenta(leer.nextInt());
        System.out.print("DNI: ");
        c1.setDni(leer.nextLong());
        menu(c1);
    }
    
    public static void menu(Cuenta c1){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una opción:");
        System.out.println("1: Consultar saldo");
        System.out.println("2: Ingresar saldo");
        System.out.println("3: Retirar saldo");
        System.out.println("4: Extración rápida (hasta 20%)");
        System.out.println("5: Verificar datos de la cuenta");
        System.out.println("6: Salir");
        
        int op=leer.nextInt();
        
        OUTER:
        switch (op) {
            case 1:
                System.out.println("El saldo actual es de: "+c1.getSalAct());
                menu(c1);
                break;
            case 2:
                System.out.println("Ingrese saldo: ");
                c1.setSalAct(c1.ingreso(c1.getSalAct()));
                System.out.println("El saldo actual es de: "+c1.getSalAct());
                menu(c1);
                break;
            case 3:
                System.out.println("Cuanto desea retirar?");
                c1.setSalAct(c1.retiro(c1.getSalAct()));
                System.out.println("Saldo retirado, el saldo restante es de: "+c1.getSalAct());
                menu(c1);
                break;
            case 4:
                System.out.println("Cuanto desea retirar? (Máximo de 20%)");
                c1.setSalAct(c1.retiroRap(c1.getSalAct()));
                menu(c1);
                break;
            case 5:
                System.out.println("Número de cuenta: "+c1.getNumCuenta());
                System.out.println("DNI: "+c1.getDni());
                menu(c1);
                break;
            case 6:
                System.out.println("Seguro que desea salir? S/N");
                String op2=leer.next();
                    switch (op2) {
                        case "s":
                            System.out.println("Gracias por utilizar nuestros servicios, hasta la próxima!");
                            break OUTER;
                        case "n":
                            menu(c1);
                            break OUTER;
                        default:
                            System.out.println("Opción incorrecta, intente nuevamente.");
                            menu(c1);
                            break;
                    }
                
            default:
                System.out.println("Opción inválida, intente nuevamente");
                menu(c1);
                break;
            }
    }
}
