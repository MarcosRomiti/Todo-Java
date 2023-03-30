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
public class embarcacionHija extends embarcacion{

    public embarcacionHija() {
    }

    public embarcacionHija(String matricula, int eslora, int año) {
        super(matricula, eslora, año);
    }

    @Deprecated
    public int calculoPrecio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
