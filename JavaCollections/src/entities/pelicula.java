/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Marcos
 */
public class pelicula {
    private String titulo;
    private String Director;
    private Integer duracion;

    public pelicula() {
    }

    public pelicula(String titulo, String Director, Integer duracion) {
        this.titulo = titulo;
        this.Director = Director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula: " + "Titulo: \t" + titulo + " Director: \t" + Director + " Duracion: \t" + duracion + "minutos" +'}';
    }
    
    
}
