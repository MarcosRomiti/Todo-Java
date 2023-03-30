/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapoo;

import entidades.Curso;
import java.util.Arrays;
import java.util.Scanner;
import servicios.servicioCurso;

/**
 *
 * @author Marcos
 */
public class ej13 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        servicioCurso sc=new servicioCurso();
        Curso cur=sc.crearCurso();
        int g=sc.calcularGanancia(cur.getHorasXdia(), cur.getPrecioXhora(), 5, cur.getDiasXsemana());
        String alum=Arrays.toString(cur.getAlumnos());
        String alumformat=alum.replace("[","");
        String alumformat2=alumformat.replace("]", "");
        System.out.println("El curso "+cur.getNombreCurso()+" con los alumnos "+alumformat2);
        System.out.println("Turno "+cur.getTurno()+", cursando "+cur.getHorasXdia()+" horas por día, "+cur.getDiasXsemana()+" días a la semana");
        System.out.println("Con un costo de $"+cur.getPrecioXhora()+" por hora, la ganancia por semana del curso es $"+g);
      
    }
}
