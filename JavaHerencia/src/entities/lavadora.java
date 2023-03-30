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
public class lavadora extends electrodomestico{
    
    private int carga;

    public lavadora() {
        
    }

    public lavadora(int carga, int precio, String color, char consumo, int peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public int calculoPrecio(int p, int c,boolean b) {
        if (c>=30) {
            p=p+500;
        }
        return p;
    }

    @Override
    public String toString() {
        return "lavadora{" + super.toString() + "carga=" + carga + '}';
    }
    
    
}
