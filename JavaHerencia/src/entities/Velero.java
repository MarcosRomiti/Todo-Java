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
public class Velero extends embarcacion{

    private int numeroMastiles;

    public Velero() {
    }

    public Velero(int numeroMastiles, String matricula, int eslora, int año) {
        super(matricula, eslora, año);
        this.numeroMastiles = numeroMastiles;
    }

    public int getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }
    
    @Override
    public int calculoPrecio() {
       int res=this.numeroMastiles*100;
        return res;
    }

    @Override
    public String toString() {
        return "Velero{" + super.toString() + "numeroMastiles=" + numeroMastiles + '}';
    }
    
    
}
