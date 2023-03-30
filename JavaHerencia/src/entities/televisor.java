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
public class televisor extends electrodomestico{
    
    private boolean tdt;
    private int tamaño;

    public televisor() {
    }

    public televisor(boolean tdt, int tamaño, int precio, String color, char consumo, int peso) {
        super(precio, color, consumo, peso);
        this.tdt = tdt;
        this.tamaño = tamaño;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public int calculoPrecio(int p, int c, boolean b) {
        if (b==true) {
            p=p+500;
        }
        if (c>40) {
            int a=(p*30)/100;
            p=p+a;
        }
        return p;
    }

    @Override
    public String toString() {
        return "televisor{" + super.toString() + "tdt=" + tdt + ", tama\u00f1o=" + tamaño + '}';
    }

    
    
    
}
