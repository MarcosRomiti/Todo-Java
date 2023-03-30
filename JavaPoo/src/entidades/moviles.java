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
public class moviles {
    //ejercicio14
    private String marca;
    private String modelo;
    private int ram;
    private int almInt;
    private int precio;
    private int codigo [];

    public moviles() {
    }

    public moviles(String marca, String modelo, int ram, int almInt, int precio, int[] codigo) {
        this.marca = marca;
        this.modelo = modelo;
        this.ram = ram;
        this.almInt = almInt;
        this.precio = precio;
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getAlmInt() {
        return almInt;
    }

    public void setAlmInt(int almInt) {
        this.almInt = almInt;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }
    
    
}
