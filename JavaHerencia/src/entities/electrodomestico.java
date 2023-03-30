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
public class electrodomestico {
    
    private int precio;
    private String color;
    private char consumo;
    private int peso;
    private char [] charConsumo = {'A','B','C','D','E','F'};
    private CharSequence[] charColores = {"blanco","negro","rojo","azul","gris"};

    public electrodomestico() {}

    public electrodomestico(int precio, String color, char consumo, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;}

    public int getPrecio() {
        return precio;}

    public void setPrecio(int precio) {
        this.precio = precio;}

    public String getColor() {
        return color;}

    public void setColor(String color) {
        this.color = color;}

    public char getConsumo() {
        return consumo;}

    public void setConsumo(char consumo) {
        this.consumo = consumo;}

    public int getPeso() {
        return peso;}

    public void setPeso(int peso) {
        this.peso = peso;}

    public char[] getCharConsumo() {
        return charConsumo;
    }

    public CharSequence[] getCharColores() {
        return charColores;
    }
    
    public int calculoPrecio(int p, int c, boolean b){
        
        return precio;
    }

    @Override
    public String toString() {
        return  "precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + '}';
    }

    
    
}
