/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Marcos
 */
public class Curso {
    //ejecicio13
    private String nombreCurso;
    private int horasXdia;
    private int diasXsemana;
    private String turno;
    private int precioXhora;
    private String alumnos[];

    public Curso() {
    }

    public Curso(String nombreCurso, int horasXdia, int diasXsemana, String turno, int precioXhora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.horasXdia = horasXdia;
        this.diasXsemana = diasXsemana;
        this.turno = turno;
        this.precioXhora = precioXhora;
        this.alumnos = alumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getHorasXdia() {
        return horasXdia;
    }

    public void setHorasXdia(int horasXdia) {
        this.horasXdia = horasXdia;
    }

    public int getDiasXsemana() {
        return diasXsemana;
    }

    public void setDiasXsemana(int diasXsemana) {
        this.diasXsemana = diasXsemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getPrecioXhora() {
        return precioXhora;
    }

    public void setPrecioXhora(int precioXhora) {
        this.precioXhora = precioXhora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
    
    
}
