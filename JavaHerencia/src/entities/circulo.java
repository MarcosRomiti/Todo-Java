/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import interfaces.interfaceFormulas;

/**
 *
 * @author Marcos
 */
public class circulo implements interfaceFormulas{

    private int radio;
    private int diametro;
    
    public circulo(int radio) {
    this.radio=radio;
    this.diametro=radio*2;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    @Override
    public double calculoArea() {
        double res=pi*(this.radio*this.radio);
        return res;
    }

    @Override
    public double calculoPerímetro() {
        double res=this.diametro*pi;
        return res;
    }
    
}
