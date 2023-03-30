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
public class Persona {
    public String nombre;
    String apellido;
    String dni;
    String fechaNacimiento;
    String nacionalidad;
    String email;

    public Persona(String nombre, String apellido, String dni, String fechaNacimiento, String nacionalidad, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

 

}
