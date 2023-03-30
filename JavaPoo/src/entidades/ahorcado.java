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
public class ahorcado {
    //ej6ex
    private String palabra [];
    private int encontradas;
    private int jugadas;
    private int logitud;

    public ahorcado() {
    }

    public ahorcado(String[] palabra, int encontradas, int jugadas, int longitud) {
        this.palabra = palabra;
        this.encontradas = encontradas;
        this.jugadas = jugadas;
        this.logitud = longitud;
    }

    public int getLogitud() {
        return logitud;
    }

    public void setLogitud(int logitud) {
        this.logitud = logitud;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getEncontradas() {
        return encontradas;
    }

    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }

    public int getJugadas() {
        return jugadas;
    }

    public void setJugadas(int jugadas) {
        this.jugadas = jugadas;
    }
    
    
}
