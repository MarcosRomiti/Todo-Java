/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollections;

import entities.alumno;
import java.util.ArrayList;
import services.servicioAlumno;

/**
 *
 * @author Marcos
 */
public class ej3 {
    public static void main(String[] args) {
        servicioAlumno sa=new servicioAlumno();
        ArrayList<alumno> alList=sa.crearAlumno();
        sa.imprimirAlumnos(alList);
        sa.promedio(alList);
    }
}
