/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.persistencia;

import java.util.ArrayList;
import tienda.entidades.fabricante;

/**
 *
 * @author Marcos
 */
public final class fabricanteDAO extends DAO{
    
    public void guardarFabricante(fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Debe indicar el fabricante");
            }

            String sql = "INSERT INTO fabricante (codigo, nombre)"
                    + "VALUES ( '" + fabricante.getCodigo()+ "' , '" + fabricante.getNombre() + "' );";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void modificarfabricante(fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Debe indicar el fabricante que desea modificar");
            }

            String sql = "UPDATE fabricante SET "
                    + "nombre = '" + fabricante.getNombre() + "' WHERE codigo = '" + fabricante.getCodigo() + "'";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void eliminarfabricante(int codigo) throws Exception {
        try {

            String sql = "DELETE FROM fabricante WHERE codigo = '" + codigo + "'";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public fabricante buscarFabricantePorCodigo(int  codigo) throws Exception {
        try {

            String sql = "SELECT * FROM fabricante "
                    + " WHERE codigo = '" + codigo + "'";

            consultarBase(sql);

            fabricante fabricante = null;
            while (resultado.next()) {
                fabricante = new fabricante();
                fabricante.setCodigo(resultado.getInt(1));
                fabricante.setNombre(resultado.getString(2));
            }
            desconectarBase();
            return fabricante;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public fabricante buscarFabricantePorNombre(String nombre) throws Exception {
        try {

            String sql = "SELECT * FROM fabricante "
                    + " WHERE nombre = '" + nombre + "'";

            consultarBase(sql);

            fabricante fabricante = null;
            while (resultado.next()) {
                fabricante = new fabricante();
                fabricante.setCodigo(resultado.getInt(1));
                fabricante.setNombre(resultado.getString(2));
            }
            desconectarBase();
            return fabricante;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public ArrayList<fabricante> listarFabricantes() throws Exception {
        try {
            String sql = "SELECT *, clave FROM fabricante ";

            consultarBase(sql);

            fabricante fabricante = null;
            ArrayList<fabricante> fabricantes = new ArrayList();
            while (resultado.next()) {
                fabricante = new fabricante();
                fabricante.setCodigo(resultado.getInt(1));
                fabricante.setNombre(resultado.getString(2));
                fabricantes.add(fabricante);
            }
            desconectarBase();
            return fabricantes;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
}
