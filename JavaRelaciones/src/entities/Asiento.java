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
public class Asiento {
    private int numero;
    private String letra;
    private boolean ocupado;

    public Asiento() {
    }

    public Asiento(int numero, String letra, boolean ocupado) {
        this.numero = numero;
        this.letra = letra;
        this.ocupado = ocupado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    @Override
    public String toString() {
        return "Asiento{" + "numero=" + numero + ", letra=" + letra + ", ocupado=" + ocupado + '}';
    }
    
    
}
