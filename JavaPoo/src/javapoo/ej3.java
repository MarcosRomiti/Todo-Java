/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapoo;

import entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class ej3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números: ");
        Operacion op=new Operacion();
        op.setNumero1(leer.nextInt());
        op.setNumero2(leer.nextInt());
        op.sumar(op.getNumero1(),op.getNumero2());
        op.restar(op.getNumero1(),op.getNumero2());
        op.multiplicar(op.getNumero1(),op.getNumero2());
        op.dividir(op.getNumero1(),op.getNumero2());
    }
}
