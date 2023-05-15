/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa_libreria;

import java.util.Scanner;
import servicios.AutorServicio;
import servicios.EditorialServicio;
import servicios.LibroServicio;

/**
 *
 * @author Marcos
 */
public class JPA_Libreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        LibroServicio ls = new LibroServicio();
        AutorServicio as= new AutorServicio();
        EditorialServicio es=new EditorialServicio();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean boo=true;
        System.out.println("\t...|Librería Egg|...");
        do {
   System.out.println("------------------------------------\n"
                    + "|         ******Menu******         |\n"
                    + "|1: Ingresar nuevo libro           |\n"
                    + "|2: Ingresar nuevo autor           |\n"
                    + "|3; Ingresar nueva editorial       |\n"
                    + "|4: Mostrar libros ingresados      |\n"
                    + "|5: Buscar libro por ISBN          |\n"
                    + "|6: Buscar libro por título        |\n"
                    + "|7: Buscar autor                   |\n"
                    + "|8: Buscar editorial               |\n"
                    + "|9: Dar de alta/baja un autor      |\n"
                    + "|10: Dar de alta/baja una editorial|\n"
                    + "|11: Buscar libro por autor        |\n"
                    + "|12: Buscar Libro por editorial    |\n"
                    + "|13: Salir                         |\n"
                    + "------------------------------------");
            int op=leer.nextInt();
            switch (op) {
                case 1:
                    ls.crearLibro();
                    break;
                case 2:
                    as.crearAutor();
                    break;
                case 3:
                    es.crearEditorial();
                    break;
                case 4:
                    ls.mostrarLibros();
                    break;
                case 5:
                    ls.buscarPorIsbn();
                    break;
                case 6:
                    ls.buscarPorTitulo();
                    break;
                case 7:
                    as.buscarPorNombre();
                    break;
                case 8:
                    es.buscarPorNombre();
                    break;
                case 9:
                    as.altaBajaAutor();
                    break;
                case 10:
                    es.altaBajaEditorial();
                    break;
                case 11:
                    ls.buscarPorAutor();
                    break;
                case 12:
                    ls.buscarPorEditorial();
                    break;
                case 13:
                    boo=false;
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (boo);
        
    }
}
