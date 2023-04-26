/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.servicios;

import java.util.ArrayList;
import java.util.Scanner;
import tienda.entidades.producto;
import tienda.persistencia.fabricanteDAO;
import tienda.persistencia.productoDAO;

/**
 *
 * @author Marcos
 */
public class servicioProducto {
    
    private final  productoDAO pd = new productoDAO();
    private final fabricanteDAO fd= new fabricanteDAO();

    public servicioProducto(){}

    /*public servicioProducto(productoDAO pd, fabricanteDAO fd) {
        this.pd = new productoDAO();
        this.fd = new fabricanteDAO();
    }*/
            
    public void listarProductos() throws Exception{
        ArrayList <producto> listaProductos = pd.listarProductos();
        System.out.println("\t | Código | Producto\t | Precio\t | Código de Fabricante");
        for (producto listaProducto : listaProductos) {
            System.out.println(listaProducto.toString());
        }
    }
    
    public void listarNombrePrecio() throws Exception{
        pd.listarNombrePrecio();
    }
    
    public void listarProductosEntrePrecios() throws Exception{
        System.out.println("Ingrese el precio mínimo y el precio máximo");
        Scanner leer = new Scanner(System.in);
        double a=leer.nextDouble();
        double b=leer.nextDouble();
        ArrayList <producto> listaProductos = pd.listarProductosEntrePrecios(a,b);
        System.out.println( "| Código | Producto                       | Precio | Código de Fabricante|");
        System.out.println("|--------|--------------------------------|--------|---------------------|");
        for (producto listaProducto : listaProductos) {
            int codigo = listaProducto.getCodigo();
            String nombre = listaProducto.getNombre();
            double precio = listaProducto.getPrecio();
            int codfab = listaProducto.getCodigoFabricante();
            System.out.printf("|%7s |%32s|%8s|%21d|\n",codigo,nombre,precio,codfab);
            System.out.println("|--------|--------------------------------|--------|---------------------|");
        }
    }
}
