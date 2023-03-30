/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollections;

import java.util.HashMap;
import java.util.Scanner;
import services.servicioTienda;

/**
 *
 * @author Marcos
 */
public class ej6 {
    public static void main(String[] args) {
    servicioTienda st=new servicioTienda();
    System.out.println("-*-*-*TIENDA SYSTEM 3500*-*-*-");
    HashMap<String, Integer> prList=st.crearProducto();
    menu(prList, st);
    }
    
    public static void menu(HashMap<String, Integer> prList, servicioTienda st){
        Scanner leer = new Scanner(System.in);
        System.out.println("Elija una opción: \n"
        +"1: Mostrar lista de productos.\n"
        +"2: Añadir productos a la lista.\n"
        +"3: Modificar precios\n"
        +"4: Eliminar producto de la lista.\n"
        +"5: Salir.");
        int op2=leer.nextInt();
        switch (op2) {
            case 1:
                st.mostrarProductos(prList);
                menu(prList, st);
                break;
            case 2:
                prList=st.agregarProducto(prList);
                menu(prList, st);
                break;
            case 3:
                prList=st.modificarPrecio(prList);
                menu(prList, st);
                break;
            case 4:
                prList=st.eliminarProducto(prList);
                menu(prList, st);
                break;
            case 5:
                System.out.println("Seguro que desea salir? S/N");
                String op3=leer.next();
                    switch (op3) {
                        case "s":
                            System.out.println("Saliendo...");
                            System.exit(0);
                        case "n":
                            menu(prList, st);
                            break;
                        default:
                            System.out.println("Opción incorrecta, intente nuevamente.");
                            menu(prList, st);
                            break;
                    }
            default:
                System.out.println("Opción incorrecta, intentelo nuevamente.");
                menu(prList, st);
                break;
        }
    }
}
