/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Marcos
 */
public class meses {
    //ej5ex
    
    private String meses [];
    private String mesSecreto;
    

    public meses(String[] meses, String mesSecreto) {
        this.meses = meses;
        this.mesSecreto = mesSecreto;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public String[] getMeses() {
        return meses;
    }

}
