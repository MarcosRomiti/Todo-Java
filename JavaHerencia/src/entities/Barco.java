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
public class Barco extends embarcacion{

    private int cv;

    public Barco() {
    }

    public Barco(int cv) {
        this.cv = cv;
    }
    
    public Barco(int cv, String matricula, int eslora, int año) {
        super(matricula, eslora, año);
        this.cv = cv;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    @Override
    public String toString() {
        return "Barco{" + super.toString() + "cv=" + cv + '}';
    }
    
    @Override
    public int calculoPrecio() {
        int res=(int)(this.cv*1.5);
        return res;
    }
    
}
