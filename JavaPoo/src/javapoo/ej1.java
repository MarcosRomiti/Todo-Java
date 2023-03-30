/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapoo;

import entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class ej1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Libro libro1 = new Libro("1234567891234","Pepito la rana","Pepe",150);
        Libro libro2 = new Libro();
        System.out.println("Libro 1 "+libro1.ISBN+" "+libro1.titulo+" "+libro1.autor+" "+libro1.numeroDePaginas);
        System.out.println("Ingresar datos del libro 2:");
        System.out.print("ISBN ");
        libro2.setISBN(leer.nextLine());
        System.out.print("Título ");
        libro2.setTitulo(leer.nextLine());
        System.out.print("Autor ");
        libro2.setAutor(leer.nextLine());
        System.out.print("Número de páginas ");
        libro2.setNumeroDePaginas(leer.nextInt());
        System.out.println("Libro 2 "+libro2.ISBN+" "+libro2.autor+" "+libro2.titulo+" "+libro2.numeroDePaginas);
    }
}
