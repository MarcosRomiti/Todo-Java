/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.main;

import tienda.servicios.servicioProducto;


/**
 a) Lista el nombre de todos los productos que hay en la tabla producto.
b) Lista los nombres y los precios de todos los productos de la tabla producto.
c) Listar aquellos productos que su precio esté entre 120 y 202.
d) Buscar y listar todos los Portátiles de la tabla producto.
e) Listar el nombre y el precio del producto más barato.
f) Ingresar un producto a la base de datos.
g) Ingresar un fabricante a la base de datos
h) Editar un producto con datos a elección.
 * @author Marcos
 */
public class Tienda {

    public static void main(String[] args) throws Exception {
        
        servicioProducto sp=new servicioProducto();
        // a) sp.listarProductos();
        // b) sp.listarNombrePrecio();
        sp.listarProductosEntrePrecios();
    }
    
}
