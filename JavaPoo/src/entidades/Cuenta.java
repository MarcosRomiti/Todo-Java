/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class Cuenta {
    //ejercicio 5
    
    private int numCuenta;
    private long dni;
    private int salAct= (int)(Math.random()*1000+1);

    public Cuenta() {
    }

    public Cuenta(int numCuenta, long dni, int salAct) {
        this.numCuenta = numCuenta;
        this.dni = dni;
        this.salAct = salAct;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public int getSalAct() {
        return salAct;
    }

    public void setSalAct(int salAct) {
        this.salAct = salAct;
    }
    
    public int ingreso(int salAct){
        Scanner leer = new Scanner(System.in);
        int ingreso=leer.nextInt();
        salAct=salAct+ingreso;
     return salAct;
    }
    public int retiro(int salAct){
        Scanner leer = new Scanner(System.in);
        int retiro=leer.nextInt();
        salAct=salAct-retiro;
        if (salAct<0) {
            salAct=0;
        }
     return salAct;
    }
    public int retiroRap(int salAct){
        Scanner leer = new Scanner(System.in);
        int retiro=leer.nextInt();
        int lim= (salAct*20)/100;
        if (retiro<=lim) {
            salAct=salAct-retiro;
            if (salAct<0) {
               salAct=0;
            }
            System.out.println("Saldo retirado, el saldo restante es de: "+salAct);
        }else{
            System.out.println("El monto ingresado supera el límite de extracción");
            System.out.println("Inténtelo nuevamente.");
        }
     return salAct;
    }
}
