/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import DAO.AutorDAO;
import entidades.Autor;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Marcos
 */
public class AutorServicio {
    
    private AutorDAO autordao=new AutorDAO();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Autor crearAutor() throws Exception {
        try {
            System.out.print("Ingrese los datos del Autor:\n"
                    + "Nombre: ");
            String nombre = leer.next();
            Autor autor = autordao.buscarPorNombre(nombre);
            if (autor==null){
                Autor au = new Autor();
                au.setNombre(nombre);
                au.setAlta(Boolean.TRUE);
                autordao.guardar(au);
                return au;
            }else{
                System.out.println("El autor ya estaba en la base de datos, se seteará el autor encontrado\n"
                        + autor.getNombre());
                return autor;
            } 
        } catch (Exception e) {
           e.printStackTrace();
            
            return null;
        }
    }
    
    public void altaBajaAutor(){
        try {
            System.out.println("Ingrese el autor a dar de alta/baja:");
            String aux = leer.next();
            Autor autor=autordao.buscarPorNombre(aux);
            if (autor==null) {
                System.out.println("No se encontró el autor indicado");
            }else{
                boolean boo;
                if (autor.getAlta()==true) {
                    System.out.println("Se dará de baja al autor");
                    autor.setAlta(false);
                }else{
                    System.out.println("Se dará de alta al autor");
                    autor.setAlta(true);
                }
                
                autordao.actualizar(autor);
            }
        } catch (Exception ex) {
            Logger.getLogger(LibroServicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void buscarPorNombre(){
        try {
            System.out.println("Ingrese el autor a buscar:");
            String aux = leer.next();
            Autor autor=autordao.buscarPorNombre(aux);
            if (autor==null) {
                System.out.println("No se encontró el autor indicado");
            }else{
                System.out.println(autor.toString());
            }
        } catch (Exception ex) {
            Logger.getLogger(AutorServicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
