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
public abstract class embarcacion {
    
    protected String matricula;
    protected int eslora;
    protected int año;

    public embarcacion() {
    }

    public embarcacion(String matricula, int eslora, int año) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.año = año;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return  "matricula=" + matricula + ", eslora=" + eslora + ", a\u00f1o=" + año + '}';
    }

    public abstract int calculoPrecio();
    
}
