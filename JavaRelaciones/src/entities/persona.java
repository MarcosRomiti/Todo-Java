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

public class persona {
    private String nombre;
    private String apellido;
    private dni dni;
    private Perro perro;

    public String getNombre() {
        return nombre;
    }

    public persona(String nombre, String apellido, dni dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public persona() {
    }
    
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public dni getDni() {
        return dni;
    }

    public void setDni(dni dni) {
        this.dni = dni;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni.getNumero() + ", perro=" + perro.toString() + '}';
    }
    
    
    
}

