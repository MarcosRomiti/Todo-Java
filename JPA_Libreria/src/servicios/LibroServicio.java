/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import DAO.AutorDAO;
import DAO.EditorialDAO;
import DAO.LibroDAO;
import entidades.Autor;
import entidades.Editorial;
import entidades.Libro;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marcos
 */
public class LibroServicio {
    
    private LibroDAO librodao = new LibroDAO();
    private AutorDAO autordao = new AutorDAO();
    private EditorialDAO editdao = new EditorialDAO();
    private AutorServicio as = new AutorServicio();
    private EditorialServicio es = new EditorialServicio();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void crearLibro() throws Exception{
        try {
        Libro libro = new Libro();
        System.out.print("Introduzca los siguientes datos:\n"
                
                + "Nombre del título: ");
        String nombre=leer.nextLine();
        Libro aux = librodao.buscarPorNombre(nombre);
            if (aux==null ){
                libro.setTitulo(nombre);
            
        
        System.out.print("Año de lanzamiento: ");
        int anio = leer.nextInt();
            if (anio < 1000 && anio > LocalDate.now().getYear()) {
                libro.setAnio(null);
                throw new Exception("El año indicado es incorrecto.");
            }else{
                libro.setAnio(anio);
            }
        
        System.out.print("Cantidad de ejemplares adquiridos: ");
        int ej=leer.nextInt();
            if (ej < 1 && ej > 2000) {
                libro.setEjemplares(null);
                throw new Exception("El dato ingresado es incorrecto");
            }else{
                libro.setEjemplares(ej);
            }
        libro.setEjemplaresRestantes(libro.getEjemplares());
        libro.setEjemplaresPrestados(0);
        libro.setAlta(Boolean.TRUE);
        
        System.out.print("Nombre del autor: ");
        String autor = leer.next();
        Autor op1 = autordao.buscarPorNombre(autor);
            if (op1==null){
                List<Autor> autores= autordao.listarTodosPorNombre(autor);
                int c=1,c2=1, op2=0;
                if (!autores.isEmpty()) {
                System.out.println("Estos son los resultados que coinciden con la búsqueda");
                for (Autor autore : autores) {
                    System.out.println(c+" "+autore.getNombre());
                    c++;
                }
                System.out.print("Si el autor se encuentra en la siguiente lista ingrese el número correspondiente, sino ingrese 0 ");
                op2=leer.nextInt();
                
                    for (Autor autore : autores) {
                        if (c2==op2) {
                            libro.setAutor(autore);
                        }
                        c2++;
                    }
                }
                if(op2==0){
                    System.out.println("Desea ingresar un nuevo autor? S/N");
                    String op3=leer.next().toLowerCase();
                    if (op3.equals("s")) {
                        Autor au=as.crearAutor();
                        libro.setAutor(au);
                    }else if (op3.equals("n")) {
                        libro.setAutor(null);
                    }else{
                    System.out.println("Opción incorrecta.");
                    libro.setAutor(null);
                }
                }else if(op2>c){
                    System.out.println("Opción incorrecta.");
                    libro.setAutor(null);
                }else{
                    System.out.println("Opción incorrecta.");
                    libro.setAutor(null);
                }
                
            }else if (op1.getNombre()==(autor)) {
                 libro.setAutor(op1);
            }
       
        System.out.print("Nombre del editorial:");
        String edit = leer.next();
        Editorial op11 = editdao.buscarPorNombre(edit);
            if(op11==null){
                List<Editorial> editoriales= editdao.listarTodosPorNombre(edit);
                int cc=1,cc2=1,op22=0;
                if (!editoriales.isEmpty()) {
                System.out.println("Estos son los resultados que coinciden con la búsqueda");
                for (Editorial editoriale : editoriales) {
                    System.out.println(cc+" "+editoriale.getNombre());
                    cc++;
                }
                
                System.out.println("Si la editorial se encuentra en la siguiente lista ingrese el número correspondiente, sino ingrese 0");
                op22=leer.nextInt();
                
                    for (Editorial editoriale : editoriales) {
                        if (cc2==op22) {
                            libro.setEditorial(editoriale);
                        }
                        cc2++;
                    }
                }
                if(op22==0){
                    System.out.println("Desea ingresar una nueva editorial? S/N");
                    String op33=leer.next().toLowerCase();
                    if (op33.equals("s")) {
                        Editorial ed=es.crearEditorial();
                        libro.setEditorial(ed);
                    }else if (op33.equals("n")) {
                        libro.setEditorial(null);
                    }else{
                    System.out.println("Opción incorrecta.");
                    libro.setEditorial(null);
                }
                }else if(op22>cc){
                    System.out.println("Opción incorrecta.");
                    libro.setEditorial(null);
                }else{
                    System.out.println("Opción incorrecta.");
                    libro.setEditorial(null);
                }
                
            }else if (op11.getNombre().equals(edit)) {
                libro.setEditorial(op11);
            }
        
        System.out.println("Si conoce el ISBN introdúzcalo, sino introduzca 0 y se generará uno nuevo");
        Long id=leer.nextLong();
            if (id>0) {
                libro.setId(id);
            }
    
        librodao.guardar(libro);
        }else{
                System.out.println("El libro indicado ya existe en la base de datos.");
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void mostrarLibros(){
        List<Libro> libros=librodao.listarTodos();
        for (Libro libro : libros) {
            System.out.println(libro.toString());
        }
    }

    public void buscarPorIsbn(){
        try {
            System.out.println("Ingrese el ISBN del libro a buscar:");
            Long aux = leer.nextLong();
            Libro libro=librodao.buscarPorIsbn(aux);
            if (libro==null) {
                System.out.println("No se encontró el libro indicado");
            }else{
                System.out.println(libro.toString());
            }
        } catch (Exception ex) {
            Logger.getLogger(LibroServicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void buscarPorTitulo(){
        try {
            System.out.println("Ingrese el título del libro a buscar:");
            String aux = leer.next();
            Libro libro=librodao.buscarPorNombre(aux);
            if (libro==null) {
                System.out.println("No se encontró el libro indicado");
            }else{
                System.out.println(libro.toString());
            }
        } catch (Exception ex) {
            Logger.getLogger(LibroServicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void buscarPorAutor(){
        try {
            System.out.println("Ingrese el autor a buscar:");
            String aux = leer.next();
            Autor autor=autordao.buscarPorNombre(aux);
            if (autor==null) {
                System.out.println("No se encontró el autor indicado");
            }else{
                List<Libro> libros = librodao.buscarPorAutor(autor.getId());
                if (libros.size()==1) {
                System.out.println("El libro encontrado es: ");
                }else{
                System.out.println("Los libros encontrados son: ");   
                }
                for (Libro libro : libros) {
                    System.out.println(libro.toString());
                }
            }
        } catch (Exception ex) {
            ex.getStackTrace();
            //Logger.getLogger(AutorServicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void buscarPorEditorial(){
        try {
            System.out.println("Ingrese la editorial a buscar:");
            String aux = leer.next();
            Editorial edit=editdao.buscarPorNombre(aux);
            if (edit==null) {
                System.out.println("No se encontró la editorial indicada");
            }else{
                List<Libro> libros = librodao.buscarPorEditorial(edit.getId());
                if (libros.size()==1) {
                System.out.println("El libro encontrado es: ");
                }else{
                System.out.println("Los libros encontrados son: ");   
                }
                for (Libro libro : libros) {
                    System.out.println(libro.toString());
                }
            }
        } catch (Exception ex) {
            ex.getStackTrace();
            //Logger.getLogger(AutorServicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
