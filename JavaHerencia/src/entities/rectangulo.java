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
public class rectangulo implements interfaceFormulas{

    private int base;
    private int altura;
    
    public rectangulo() {
    }

    public rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public double calculoArea() {
        double res=this.base*this.altura;
        return res;
    }

    @Override
    public double calculoPerímetro() {
        double res=(this.base+this.altura)*2;
        return res;
    }
    
}
