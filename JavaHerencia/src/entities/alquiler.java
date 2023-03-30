/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;
import java.time.LocalDate;

/**
 *
 * @author Marcos
 */
public class alquiler {
    
    private String nombre;
    private int dni;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private boolean [] posicionAmarre={false,false,false,false,false,false,false,false,false,false,};
    private embarcacion embarcSituada;
    private int precioAlquiler;
    
    public alquiler() {
    }

    public alquiler(String nombre, int dni, LocalDate fechaAlquiler, LocalDate fechaDevolucion, embarcacion embarcSituada, int precioAlquiler) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.embarcSituada = embarcSituada;
        this.precioAlquiler = precioAlquiler;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public boolean[] getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(boolean[] posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public embarcacion getEmbarcSituada() {
        return embarcSituada;
    }

    public void setEmbarcSituada(embarcacion embarcSituada) {
        this.embarcSituada = embarcSituada;
    }

    public int getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(int precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    @Override
    public String toString() {
        return "alquiler{" + "nombre=" + nombre + ", dni=" + dni + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion + ", embarcSituada=" + embarcSituada + ", precioAlquiler=" + precioAlquiler + '}';
    }

    
}

