/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import DAO.EditorialDAO;
import entidades.Editorial;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marcos
 */
public class EditorialServicio {
    
     private EditorialDAO editdao=new EditorialDAO();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Editorial crearEditorial() throws Exception {
        try {
            System.out.print("Ingrese los datos de la Editorial:\n"
                    + "Nombre: ");
            String nombre = leer.next();
            Editorial editorial = editdao.buscarPorNombre(nombre);
            if (editorial == null) {
                Editorial ed = new Editorial();
                ed.setNombre(nombre);
                ed.setAlta(Boolean.TRUE);
                editdao.guardar(ed);
                return ed;
            }else{
                System.out.println("La editorial ya estaba en la base de datos, se seteará la editorial encontrada\n"
                        + editorial.getNombre());
                return editorial;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
     public void altaBajaEditorial(){
        try {
            System.out.println("Ingrese la editorial a dar de alta/baja:");
            String aux = leer.next();
            Editorial edit=editdao.buscarPorNombre(aux);
            if (edit==null) {
                System.out.println("No se encontró la editorial indicada");
            }else{
                boolean boo;
                if (edit.getAlta()==true) {
                    System.out.println("Se dará de baja la editorial");
                    edit.setAlta(false);
                }else{
                    System.out.println("Se dará de alta la editorial");
                    edit.setAlta(true);
                }
                
                editdao.actualizar(edit);
            }
        } catch (Exception ex) {
            Logger.getLogger(LibroServicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
     public void buscarPorNombre(){
         try {
             System.out.println("Ingrese la editorial a buscar:");
             String aux = leer.next();
             Editorial edit=editdao.buscarPorNombre(aux);
             if (edit==null) {
                 System.out.println("No se encontró la editorial indicada");
             }else{
                System.out.println(edit.toString()); 
             }
         } catch (Exception ex) {
             Logger.getLogger(EditorialServicio.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
}
