/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Barco;
import entities.Velero;
import entities.Yate;
import entities.alquiler;
import entities.embarcacionHija;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class servicioAmarre {
    Scanner leer = new Scanner(System.in);
    
    public alquiler preAlquiler(){
        alquiler alq =crearAlquiler();
        System.out.println("Elija el tipo de embarcación que posee: \n"
                + "1: Velero \n"
                + "2: Barco \n"
                + "3: Yate");
        boolean boo;
        do {
        int op=leer.nextInt();
        switch (op) {
            case 1:
                Velero velero=crearVelero();
                alq.setPrecioAlquiler(velero.calculoPrecio()+calculoPrecioBase(alq, velero.getEslora()));
                alq.setEmbarcSituada(velero);
                boo=false;
                break;
            case 2:
                Barco barco=crearBarco();
                alq.setPrecioAlquiler(barco.calculoPrecio()+calculoPrecioBase(alq, barco.getEslora()));
                alq.setEmbarcSituada(barco);
                boo=false;
                break;
            case 3:
                Yate yate=crearYate();
                alq.setPrecioAlquiler(yate.calculoPrecio()+calculoPrecioBase(alq, yate.getEslora()));
                alq.setEmbarcSituada(yate);
                boo=false;
                break;
            default:
                System.out.println("Opción incorrecta, intente nuevamente.");
                boo=true;
        }
        }while(boo);
        
        return alq;
    }
    
    public int calculoPrecioBase(alquiler alq, int eslora){
        int res= (int)ChronoUnit.DAYS.between(alq.getFechaAlquiler(),alq.getFechaDevolucion());
        res=(eslora*10)*res;
        return res;
    }
    
    public alquiler crearAlquiler(){
        System.out.print("Ingrese su Nombre: ");
        String nombre = leer.next();
        System.out.print("Ingrese su documento: ");
        int dni=leer.nextInt();
        LocalDate fechaAlquiler = null;
        System.out.print("Usted va a amarrar ahora? S/N:");
        String op=leer.next().toUpperCase();
        boolean boo;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.US);
        do {
        if (op.equals("N")) {
            System.out.print("Ingrese la fecha de arribo: (dd/mm/aaaa)");
            String fecha=leer.next();
            fechaAlquiler = LocalDate.parse(fecha, formatter);
            boo=false;
        }else if(op.equals("S")){
            fechaAlquiler = LocalDate.parse(LocalDate.now().format(DateTimeFormatter.ISO_DATE), formatter);
            boo=false;
        }else{
            System.out.println("Opción inválida, int.entelo nuevamente");
            boo=true;
        }
        } while (boo);
        System.out.print("Ingrese fecha de egreso: ");
        LocalDate fechaDevolucion = LocalDate.parse(leer.next(), formatter);
        
        return new alquiler(nombre, dni, fechaAlquiler, fechaDevolucion, null, 0);
    }
    
    public embarcacionHija crearEmbarcacion(){
        System.out.print("Ingrese la matricula: ");
        String mat=leer.next();
        System.out.print("Ingrese la eslora: ");
        int eslora=leer.nextInt();
        System.out.print("Ingrese el año: ");
        int anio=leer.nextInt();
        return new embarcacionHija(mat, eslora, anio);
    }

    public Velero crearVelero(){
        embarcacionHija emb=crearEmbarcacion();
        System.out.print("Especifique la cantidad de mástiles: ");
        int mastiles=leer.nextInt();
        return new Velero(mastiles, emb.getMatricula(), emb.getEslora(), emb.getAño());
    }
    
    public Barco crearBarco(){
        embarcacionHija emb=crearEmbarcacion();
        System.out.print("Especifique la potencia le la embarcación: ");
        int cv=leer.nextInt();
        return new Barco(cv, emb.getMatricula(), emb.getEslora(), emb.getAño());
    }

    public Yate crearYate(){
        embarcacionHija emb=crearEmbarcacion();
        System.out.print("Especifique la potencia le la embarcación: ");
        int cv=leer.nextInt();
        System.out.print("Especifique la cantidad de camarotes: ");
        int camarotes=leer.nextInt();
        return new Yate(cv, camarotes, emb.getMatricula(), emb.getEslora(), emb.getAño());
    }
}
    