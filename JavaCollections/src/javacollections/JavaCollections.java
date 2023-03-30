/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollections;

import entities.Libros;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Marcos
 */
public class JavaCollections {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);  
    
    ArrayList<Integer> listado = new ArrayList();
    int a= 1, b=1,c=34,d=45,e=56;
    listado.add(a);
    listado.add(b);
    listado.add(c);
    listado.add(d);
    listado.add(e);
    TreeSet<String> list2 = new TreeSet();
    String z="a98",x="a98",v="a76",n="a65",m="a54";
    list2.add(z);
    list2.add(x);
    list2.add(v);
    list2.add(n);
    list2.add(m);
    HashMap<Integer, String> alumnos = new HashMap();
    int dni1=46546,dni2=45646,dni3=84353123,dni4=8691633,dni5=8912313;
    String nombreALumno1="gfsdgv",nombreALumno2="gfsdgv",nombreALumno3="fdsafsd",nombreALumno4="gfdgdfgf",nombreALumno5="gfdgsbvn";
    alumnos.put(dni1,nombreALumno1);
    alumnos.put(dni2,nombreALumno2);
    alumnos.put(dni3,nombreALumno3);
    alumnos.put(dni4,nombreALumno4);
    alumnos.put(dni5,nombreALumno5);
        
        System.out.println(listado);
        System.out.println(list2);
        System.out.println(alumnos);
        //listado.remove(0);
        //list2.remove(m);
        alumnos.remove(2);
        System.out.println(listado);
        System.out.println(list2);
        System.out.println(alumnos);
        int l=1;
        for (Integer integer : listado) {
            
            System.out.println(l+":"+integer);
            l++;
        }
        l=1;
        for (String string : list2) {
            System.out.println(l+": "+string);
            l++;
        }
        l=1;
        for (Map.Entry<Integer, String> aux : alumnos.entrySet()) {
            System.out.println(l+" DNI: "+ aux.getKey()+"\n"
            +"Nombre: "+aux.getValue()+"\n"
            +"Hash code:" + aux.hashCode());
            l++;
        }
        
        TreeSet<String> personas2 = new TreeSet();
        String na1 = "Albus";
        String na2 = "Severus";
        personas2.add(na1);
        personas2.add(na2);
        
        
        HashMap<String,Integer> personas = new HashMap();
        String n1 = "Albus";
        int n11=123;
        String n2 = "Severus";
        int n22=456;
        personas.put(n1,n11);
        personas.put(n2,n22);
        
        ArrayList<String> bebidas= new ArrayList();
        bebidas.add("café");
        bebidas.add("té");
        Iterator<String> it = bebidas.iterator();
        while(it.hasNext()){
        
            if (it.next().equals("café")) {
                it.remove();
            }
            System.out.println(bebidas.size());
        }
        for (Map.Entry<Integer, String> aux : alumnos.entrySet()) {
            System.out.println(aux.hashCode());

        }

        
        
    
        ArrayList<Libros> Libros=new ArrayList();
        for (int i = 0; i < 3; i++) {
            System.out.println("nuevo libro");
        Libros L1=new Libros();
            System.out.println("titulo");
        L1.setTitulo(leer.next());
            System.out.println("autor");
        L1.setAutor(leer.next());
            System.out.println("paginas");
        L1.setPaginas(leer.nextInt());

        Libros.add(L1);
        }
        for (Libros Libro : Libros) {
            System.out.println(Libro.toString());
        }
    }
}
