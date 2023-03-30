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
public class Pelicula {
    private String titulo;
    private int duracion;
    private int edadMin;
    private int valorBoleto;

    public Pelicula() {
    }

    public Pelicula(String titulo, int duracion, int edadMin, int valorBoleto) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMin = edadMin;
        this.valorBoleto = valorBoleto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getEdadMin() {
        return edadMin;
    }

    public void setEdadMin(int edadMin) {
        this.edadMin = edadMin;
    }

    public int getValorBoleto() {
        return valorBoleto;
    }

    public void setValorBoleto(int valorBoleto) {
        this.valorBoleto = valorBoleto;
    }
    
    
}
