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
public class Revolver {
    
    private int PosAct;
    private int PosAgua;

    public Revolver() {
    }

    public Revolver(int PosAct, int PosAgua) {
        this.PosAct = PosAct;
        this.PosAgua = PosAgua;
    }

    public int getPosAct() {
        return PosAct;
    }

    public void setPosAct(int PosAct) {
        this.PosAct = PosAct;
    }

    public int getPosAgua() {
        return PosAgua;
    }

    public void setPosAgua(int PosAgua) {
        this.PosAgua = PosAgua;
    }

    @Override
    public String toString() {
        return "Revolver-> " + "posición actual: " + PosAct + ", posición agua: " + PosAgua + '}';
    }
    
    
}
