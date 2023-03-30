/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Curso;
import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class servicioCurso {
    Scanner leer = new Scanner(System.in);    
    
    public String[] cargarAlumnos(){
        System.out.println("Ingrese los nombres de los alumnos");
        String[] alumnos=new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Alumno "+(i+1));
            alumnos[i]=leer.next();
        }
        return alumnos;
    }
    
    public Curso crearCurso(){
        System.out.println("Ingrese el nombre del curso:");
        String nombre=leer.nextLine();
        System.out.println("Ingrese la cantidad de horas por día a cursar:");
        int horas=leer.nextInt();
        System.out.println("Especifique los dias por semana de cursado:");
        int dias=leer.nextInt();
        System.out.println("Indique si es turno mañana o tarde (M o T)");
        String turno=leer.next();
        if ("m".equals(turno)) {
            turno="mañana";
        }else if("t".equals(turno)){
            turno="tarde";
        }else{
            turno="no especificado";
        }
        System.out.println("Indique el precio de cursado por hora:");
        int precio=leer.nextInt();
        
        return new Curso(nombre, horas, dias, turno, precio, cargarAlumnos());
                
    }
    
    public int calcularGanancia(int horas, int precio, int alumnos, int dias){
        int ganancia=((horas*precio)*alumnos)*dias;
        
        return ganancia;
    }
}
