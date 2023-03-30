/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class servicioAlumno {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    public ArrayList<alumno> crearAlumno(){
        String nombre;
        int c=0;
        boolean boo=true;
        ArrayList<alumno> alList=new ArrayList();
        System.out.println("Ingrese el nombre del alumno:");
        while (boo) {
        alumno al=new alumno();
        al.setNombre(nombre = leer.next());
        setearNotas(al.getNota());
        alList.add(c, al);
        System.out.println("Desea añadir otro alumno? S/N");
        String op;
            op=leer.next();
            boo=true;
            if (op.equals("s")) {
                c++;
                System.out.println("Ingrese el nombre del alumno:");
            }else if(op.equals("n")){
                boo=false;
            }else{
                System.out.println("Opción incorrecta");
            }
        }
        
        return alList;
    }
    
    public void setearNotas(ArrayList<Integer> nota){
        System.out.println("Ingrese las 3 notas:");
        nota.add(0, leer.nextInt());
        nota.add(1, leer.nextInt());
        nota.add(2, leer.nextInt());
    }
    
    public void imprimirAlumnos(ArrayList<alumno> al){
        for (Object aux : al) {
            
            System.out.println(aux.toString());
        }
    }
    
    /*public void promedio(ArrayList<alumno> al){
        System.out.println("Ingrese el nombre del alumno para calcular su promedio:");
        String buscar=leer.next();
        Integer promedio=0;
        Iterator<alumno> it=al.iterator();
        int i=0;
        while (it.hasNext()) {
            if (it.next().getNombre().equalsIgnoreCase(buscar)) {
                for (alumno object : al) {
                    System.out.println(object.getNota().get(3));
                }
            }
        }
    }*/
    
    public void promedio(ArrayList<alumno> al){
        System.out.println("Ingrese el nombre del alumno para calcular su promedio:");
        String buscar=leer.next();
        Double promedio=0.0;
        boolean boo=false;
        Iterator<alumno> it=al.iterator();
        int i=0;
        while (it.hasNext()) {
            if (it.next().getNombre().equalsIgnoreCase(buscar)) {
                
                for (alumno object : al) {
                    if (buscar.equals(object.getNombre())) {
                    for (int j = 0; j <3; j++) {
                    promedio=promedio+object.getNota().get(j);
                    boo=true;
                    }
                    }
                }
            }
        }
        if (boo==true) {
        promedio=promedio/3;
        System.out.println("El promedio de "+buscar+" es: "+Math.round(promedio));
        }else if(boo==false){
            System.out.println("No se encontró al alunmo especificado");
        }
    }
}
