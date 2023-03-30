/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Marcos
 */
public class servicioPais {
    Scanner leer = new Scanner(System.in);
    public Set<pais> crearPaises(){
        Set <pais> paList= new HashSet();
        boolean boo=true;
        System.out.println("Ingrese un  País para añadirlo a la lista");
        while (boo) {
            pais pa=new pais();
            pa.setNombre(leer.next());
            paList.add(pa);
            System.out.println("Desea ingresar otro país? S/N");
            String op=leer.next();
             if (op.equals("s")) {
                System.out.println("Ingrese un nuevo país:");
            }else if(op.equals("n")){
                boo=false;
            }else{
                System.out.println("Opción incorrecta");
            }
        }
        return paList;
    }
    
    public void mostrarPaises(Set <pais> paList){
        System.out.println("Esta es la lista de Paises:");
        for (pais object : paList) {
            System.out.println(object.toString());
        }
    }
    
    public Set<pais> mostrarPaisesOrdeALf(Set <pais> paList){
        System.out.println("Esta es la lista de Países ordenados alfabeticamente:");
        ArrayList<pais> paList2=new ArrayList(paList);
        Collections.sort(paList2, Comparators.compararPaises);
        for (pais object : paList2) {
            System.out.println(object.toString());
        }
        LinkedHashSet<pais> paList3=new LinkedHashSet(paList2);
        return paList3;
    }
    
    public Set<pais> eliminarPais(Set <pais> paList){
        System.out.println("Que país desea eliminar?");
        String op=leer.next();
        Iterator<pais> it=paList.iterator();
        while (it.hasNext()) {
            if (it.next().getNombre().equals(op)) {
                it.remove();
            }
        }
        return paList;
    }
        
    
}
