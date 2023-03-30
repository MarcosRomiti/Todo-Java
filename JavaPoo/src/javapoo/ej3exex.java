/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapoo;

import entidades.pass;
import java.util.Scanner;
import servicios.servicioPass;


/**
 *
 * @author Marcos
 */
public class ej3exex {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);   
    servicioPass sp=new servicioPass();
    pass pa=sp.ingresoDatos();
    menu(pa, sp);
    }
    
    public static void menu(pass pa, servicioPass sp){
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido "+pa.getNombre()+"! \n" 
        +"Menu de cuenta de usuario \n"
        +"1- Cambiar contraseña. \n"
        +"2- Verificar nivel de seguridad de la contraseña. \n"
        +"3- Modificar Nombre. \n"
        +"4- Modificar DNI \n"
        +"5- Salir");
        int op=leer.nextInt();
        
        switch (op) {
            case 1:
                pa.setPass(sp.cambiarPass(pa.getPass()));
                menu(pa, sp);
                break;
            case 2:
                sp.analizarPass(pa.getPass());
                menu(pa, sp);
                break;
            case 3:
                pa.setNombre(sp.cambiarNombre(pa.getNombre(), pa.getPass()));
                menu(pa, sp);
                break;
            case 4:
                pa.setDni(sp.cambiarDni(pa.getDni(), pa.getPass()));
                menu(pa, sp);
                break;
            case 5:
                System.out.println("Seguro que desea salir? S/N");
                String op2=leer.next();
                    switch (op2) {
                        case "s":
                            System.out.println("Saliendo...");
                            System.exit(0);
                        case "n":
                            menu(pa, sp);
                            break;
                        default:
                            System.out.println("Opción incorrecta, intente nuevamente.");
                            menu(pa, sp);
                            break;
                    }
            default:
                System.out.println("Opción incorrecta, intente nuevamente.");
                menu(pa, sp);
                break;
        }
    }
}
