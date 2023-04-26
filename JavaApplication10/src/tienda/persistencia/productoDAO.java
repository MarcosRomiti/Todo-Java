/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.persistencia;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import tienda.entidades.fabricante;
import tienda.entidades.producto;


/**
 *
 * @author Marcos
 */
public final class productoDAO extends DAO{
    
    private final fabricanteDAO fd;

    public productoDAO() {
        this.fd = new fabricanteDAO();
    }

    public void guardarProducto(producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar el producto");
            }
            String sql = "INSERT INTO producto (codigo, nombre, precio, codigoFabricante) "
                    + "VALUES ( '" + producto.getNombre() + "' ," + producto.getPrecio() + "' ," + producto.getCodigoFabricante() + " );";

            System.out.println(sql);
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void modificarProducto(producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar el producto que desea modificar");
            }
            String sql = "UPDATE producto SET "
                    + "  nombre = '" + producto.getNombre() + "' , precio ='" + producto.getPrecio() + "' , codigoFabricante = " + producto.getCodigoFabricante()
                    + " WHERE id = '" + producto.getCodigo() + "'";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void eliminarProducto(int codigo) throws Exception {
        try {
            String sql = "DELETE FROM producto WHERE codigo = " + codigo + "";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    /*public producto buscarProductoPorCodigo(int codigo) throws Exception {
        try {
            String sql = "SELECT * FROM producto WHERE codigo = " + codigo + "";
            consultarBase(sql);
            producto producto = null;
            while (resultado.next()) {
                producto = new producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                Integer codigoFabricante = resultado.getInt(4);
                int fabricante = servicioFabricante.buscarFabricantePorCodigo(codigoFabricante);
                producto.setCodigoFabricante(fabricante);
            }
            desconectarBase();
            return producto;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }*/

    public ArrayList<producto> listarProductos() throws Exception {
        try {
            String sql = "SELECT * FROM producto ";
            consultarBase(sql);
            producto producto = null;
            ArrayList<producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                Integer codigoFabricante = resultado.getInt(4);
                producto.setCodigoFabricante(codigoFabricante);
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
    
    public void listarNombrePrecio() throws Exception {
        try {
            String sql = "SELECT nombre, precio FROM producto ";
            consultarBase(sql);
            System.out.println("\t | Producto\t | Precio");
            while (resultado.next()) {
            String nombre = resultado.getString(1);
            int precio = resultado.getInt(2);
            System.out.println("\t | "+nombre+"\t | "+precio);
            }
            desconectarBase();
            
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
    
    public ArrayList<producto> listarProductosEntrePrecios(double a, double b) throws Exception {
        try {
            
            String sql = "SELECT * FROM producto where precio between "+a+" and "+b;
            consultarBase(sql);
            producto producto = null;
            ArrayList<producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                Integer codigoFabricante = resultado.getInt(4);
                producto.setCodigoFabricante(codigoFabricante);
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
}
