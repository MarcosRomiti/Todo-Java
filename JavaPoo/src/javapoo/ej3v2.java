/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapoo;

import entidades.OperacionV2;
import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class ej3v2 {
    public static void main(String[] args) {
       
        System.out.println("Ingrese dos números: ");
        OperacionV2 op=new OperacionV2();
        op.setNumero1(op.crearOperacion(op.getNumero1(), op.getNumero2()));
        op.setNumero2(op.crearOperacion(op.getNumero1(), op.getNumero2()));
        op.sumar(op.getNumero1(),op.getNumero2());
        op.restar(op.getNumero1(),op.getNumero2());
        op.multiplicar(op.getNumero1(),op.getNumero2());
        op.dividir(op.getNumero1(),op.getNumero2());
    }
}
