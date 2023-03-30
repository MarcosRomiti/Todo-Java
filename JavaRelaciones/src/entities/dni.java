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
public class dni {
    private String serie;
    private Integer numero;

    public dni(Integer numero) {
        this.numero = numero;
    }

    public dni() {
    }

    
    
    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "dni{" + "serie=" + serie + ", numero=" + numero + '}';
    }
    
    
}

