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
public class NIF {
    //ej4ex
    
    private int dni;
    private String nif;

    public NIF() {
    }

    public NIF(int dni, String nif) {
        this.dni = dni;
        this.nif = nif;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }
    
    
}
