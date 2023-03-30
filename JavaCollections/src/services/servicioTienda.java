/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 *
 * @author Marcos
 */
public class servicioTienda {
    
    Scanner leer = new Scanner(System.in);
    public HashMap<String, Integer> crearProducto(){
        HashMap <String, Integer> prList= new HashMap();
        boolean boo=true;
        System.out.println("Ingrese un producto y su precio para añadirlo a la lista:");
        while (boo) {
            String producto=leer.next();
            Integer precio=leer.nextInt();
            prList.put(producto, precio);
            System.out.println("Desea ingresar otro producto? S/N");
            String op=leer.next();
             if (op.equals("s")) {
                System.out.println("Ingrese un nuevo producto:");
            }else if(op.equals("n")){
                boo=false;
            }else{
                System.out.println("Opción incorrecta");
            }
        }
        return prList;
    }
    
    public HashMap<String, Integer> agregarProducto(HashMap<String, Integer> prList){
        System.out.println("Ingrese el nuevo producto y el precio:");
        boolean boo = true;
        while (boo) {
            String producto = leer.next();
            Integer precio = leer.nextInt();
            prList.put(producto, precio);
            System.out.println("Desea ingresar otro producto? S/N");
            String op = leer.next();
            if (op.equals("s")) {
                System.out.println("Ingrese un nuevo producto:");
            } else if (op.equals("n")) {
                boo = false;
            } else {
                System.out.println("Opción incorrecta");
            }
        }
            return prList;
    }
    
    public HashMap<String, Integer> modificarPrecio(HashMap<String, Integer> prList){
        System.out.println("Ingrese el producto a modificar el precio:");
        boolean boo = true;
        while (boo) {
        String producto=leer.next();
        for (Map.Entry<String, Integer> entry : prList.entrySet()) {
            if (entry.getKey().equals(producto)) {
               entry.setValue(leer.nextInt());
            }else{
                System.out.println("El producto no se encuentra en la lista.");
            }
        }
        System.out.println("Desea modificar otro producto? S/N");
            String op = leer.next();
            if (op.equals("s")) {
                System.out.println("Ingrese un nuevo producto a modificar:");
            } else if (op.equals("n")) {
                boo = false;
            } else {
                System.out.println("Opción incorrecta");
            }
        }
        return prList;
    }
    
    public HashMap<String, Integer> eliminarProducto(HashMap<String, Integer> prList){
        System.out.println("Ingrese el producto a eliminar:");
        boolean boo = true;
        while (boo) {
        String producto=leer.next();
        prList.remove(producto);
        System.out.println("Desea eliminar otro producto? S/N");
            String op = leer.next();
            if (op.equals("s")) {
                System.out.println("Ingrese un nuevo producto a eliminar:");
            } else if (op.equals("n")) {
                boo = false;
            } else {
                System.out.println("Opción incorrecta");
            }
        }
        return prList;
    }
    
    public void mostrarProductos(HashMap<String, Integer> prList){
        System.out.println("Estos son los precios en la lista:");
        int c=1;
        for (Map.Entry<String, Integer> entry : prList.entrySet()) {
            System.out.println("Producto "+c+": \t"+entry.getKey()+"\n"
            + "Precio: \t"+entry.getValue());
            c++;
         }
    }
}
