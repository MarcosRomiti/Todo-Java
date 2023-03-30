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
public class Circunferencia {
  //ejercicio 2
    private int radio;

    public Circunferencia(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    
    public void area(int radio){
      double area;
      area=3.14*(radio*radio);
        System.out.println("El área es "+area);
    }
    public static void perimetro(int radio){
        double per;
        per=2*3.14*radio;
        System.out.println("El perímetro es "+per);
    }
}
