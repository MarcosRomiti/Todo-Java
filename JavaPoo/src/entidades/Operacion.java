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
public class Operacion {
    //ejercicio 3
    private int numero1;
    private int numero2;

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public void sumar(int numero1, int numero2){
        System.out.println("La suma de los números es: "+(numero1+numero2));
    }
    public void restar(int numero1, int numero2){
        System.out.println("La resta de los números es: "+(numero1-numero2));
    }
    public void multiplicar(int numero1, int numero2){
        if (numero1<=0 || numero2 <=0) {
            System.out.println("Uno de los números es 0, Error el resultado es 0");
        }else{
            System.out.println("La multiplicación de los números es "+(numero1*numero2));
        }
    }
    public void dividir(int numero1, int numero2){
        if (numero1<=0 || numero2 <=0) {
            System.out.println("Uno de los números es 0, Error el resultado es 0");
        }else{
            System.out.println("La divición de los números es "+(numero1/numero2));
        }
    }
}
