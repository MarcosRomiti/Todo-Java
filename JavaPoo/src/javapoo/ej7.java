/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapoo;

import entidades.Persona2;
import servicios.servicioPersona;

/**
 *
 * @author Marcos
 */
public class ej7 {
    public static void main(String[] args) {
        
        servicioPersona sp= new servicioPersona();
        Persona2 p1[]=new Persona2[4];
        int sobrep=0,pideal=0,pbajo=0,mayor=0,menor=0;
        try{
        for (int i = 0; i < 2; i++) {
        p1[i]=null; //sp.crearPersona();
        p1[i].setImc(sp.cimc(p1[i].getPeso(),p1[i].getAltura()));
        p1[i].setMayor(sp.snmayor(p1[i].getEdad()));
        System.out.println(p1[i].getNombre()+" "+p1[i].getEdad()+" "+p1[i].getSexo()+" "+p1[i].getAltura()+" "+p1[i].getPeso());
        sp.evaluador(p1[i],p1[i].getImc());
        sp.mayorOno(p1[i], p1[i].getMayor());
            if (p1[i].getImc()==-1) {
                pbajo++;
            }else if(p1[i].getImc()==0){
                pideal++;
            }else{
                sobrep++;
            }
            if (p1[i].getMayor()) {
                mayor++;
            }else{
                menor++;
            }
        }
        System.out.println("De las 2 personas "+pbajo+" están por debajo del peso ideal");
        System.out.println(pideal+" están en el peso ideal y "+sobrep+" tienen sobrepeso");
        System.out.println("Además "+mayor+" personas son mayores de edad y "+menor+" son menores.");
        /*Persona2 p2=sp.crearPersona();
        p2.setImc(sp.cimc(p2.getPeso(),p2.getAltura()));
        p2.setMayor(sp.snmayor(p2.getEdad()));
        System.out.println(p2.getNombre()+" "+p2.getEdad()+" "+p2.getSexo()+" "+p2.getAltura()+" "+p2.getPeso());
        */
        }catch(NullPointerException a){
            System.out.println("Persona no fue inicializada.");
        }
}
    
}
