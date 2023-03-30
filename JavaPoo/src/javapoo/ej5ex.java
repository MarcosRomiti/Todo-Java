/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapoo;

import entidades.meses;
import java.util.Scanner;
import servicios.sevicioMeses;

/**
 *
 * @author Marcos
 */
public class ej5ex {
    public static void main(String[] args) {
        sevicioMeses sm=new sevicioMeses();
        meses m=sm.setearMeses();
        sm.adivinar(m.getMeses(), m.getMesSecreto());
    }
}
