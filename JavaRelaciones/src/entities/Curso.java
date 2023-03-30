/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;


/**
 *
 * @author Marcos
 */
public class Curso {
    private ArrayList<persona> alumno;

    public Curso() {
    }

    public Curso(ArrayList<persona> alumno) {
        this.alumno = alumno;
    }

    public ArrayList<persona> getAlumno() {
        return alumno;
    }

    public void setAlumno(ArrayList<persona> alumno) {
        this.alumno = alumno;
    }
    
    
}
