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
public class Yate extends embarcacion{

    private int cv;
    private int numeroCamarotes;

    public Yate() {
    }

    public Yate(int cv, int numeroCamarotes, String matricula, int eslora, int año) {
        super(matricula, eslora, año);
        this.cv = cv;
        this.numeroCamarotes = numeroCamarotes;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getNumeroCamarotes() {
        return numeroCamarotes;
    }

    public void setNumeroCamarotes(int numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }

    @Override
    public String toString() {
        return "Yate{" + super.toString() + "cv=" + cv + ", numeroCamarotes=" + numeroCamarotes + '}';
    }
    
    @Override
    public int calculoPrecio() {
        int res=(int)(this.cv*1.5)+(this.numeroCamarotes*50);
        return res;
    }
    
}
