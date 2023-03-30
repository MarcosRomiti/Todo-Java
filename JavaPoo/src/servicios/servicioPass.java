/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.pass;
import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class servicioPass {
    Scanner leer = new Scanner(System.in);
    public pass ingresoDatos(){
        System.out.println("Para registrarse ingrese nombre, dni y una contraseña de 10 dígitos");
        System.out.print("Nombre: ");
        String nombre=leer.next();
        System.out.print("DNI: ");
        int dni=leer.nextInt();
        System.out.print("Contraseña: ");
        String pass=leer.next();
        int l=pass.length();
        while (l!=10) {
            System.out.println("La contraseña debe tener 10 caracteres, inténtelo nuevamente");
            pass=leer.next();
            l=pass.length();
        }
        return new pass(pass, nombre, dni);
    }
    
    public String cambiarPass(String pass) {
        boolean boo = false;
        System.out.print("Ingrese la antígua contraseña: ");
        String p1 = leer.next();
        int c = 0;
        if (p1.equals(pass)) {
                boo=true;
            }
        
        while (boo==false) {

            if (boo==false) {
                System.out.println("Contraseña incorrecta, intente nuevamente.");
                p1 = leer.next();
                c++;
                if (p1.equals(pass) && c != 10) {
                    boo = true;
                }
            }
        }
        
        if (boo) {
            System.out.print("Ingrese la nueva contraseña: ");
            String pass2 = leer.next();
            int l = pass2.length();
            boolean boo2=false;
            if (!pass2.equals(pass)&&l==10) {
                boo2=true;
            }
            while (boo2==false) {
                if(l!=10){
                System.out.println("La contraseña debe tener 10 caracteres, inténtelo nuevamente");
                pass2 = leer.next();
                l=0;
                l = pass2.length();
                c++;
                if (!pass2.equals(pass) && c != 10 && l==10) {
                    boo2 = true;
                }
                }else if(pass2.equals(pass)){    
                System.out.println("La contraseña ingresada es igual a la anterior, intentelo nuevamente.");
                pass2 = leer.next();
                l=0;
                l = pass2.length();
                c++;
                if (!pass2.equals(pass) && c != 10 && l==10) {
                    boo2 = true;
                }
                }
            }

            System.out.println("La contraseña fue modificanda correctamente.");
            pass=pass2;
        } else if (c == 10) {
            System.out.println("Demasiados intentos.");
        }
        
        return pass;
    }
    
    public void analizarPass(String pass){
        int a=0,z=0;
        char ta;
        for (int i = 0; i < 10; i++) {
            ta = pass.charAt(i);
            if (ta == 'a'){
                a++;
        
            }else if(ta=='z'){
                z++;
        }
        }
        if (z>0&&a>1) {
            System.out.println("La contraseña es nivel alto.");
        }else if(z>0){
            System.out.println("La contraseña es nivel medio.");
        }else{
            System.out.println("La contraseña es nivel bajo.");
        }
    }
    
    public String cambiarNombre(String nombre, String pass){
        int c=0;
        boolean boo=false;
        System.out.println("Para cambiar los datos por favor ingrese su contraseña:");
        String p1=leer.next();
        if (p1.equals(pass)) {
                boo=true;
            }
        while (boo==false){
            System.out.println("Contraseña incorrecta, intente nuevamente.");
            p1=leer.next();
            c++;
            if (p1.equals(pass)&&c!=10) {
                boo=true;
            }
        } 
        System.out.println("Nombre: "+nombre);
        
        if (p1.equals(pass)) {
            System.out.println("Ingrese el nuevo nombre");
            nombre=leer.next();
            System.out.println("Los datos se modificaron exitosamente: \n"
            + "Nombre: "+nombre);
        }else if(c==10){
            System.out.println("Demasiados intentos.");
        }
        return nombre;
    }
    
        public int cambiarDni(int dni, String pass){
        int c=0;
        boolean boo=false;
        System.out.println("Para cambiar los datos por favor ingrese su contraseña:");
        String p1=leer.next();
        if (p1.equals(pass)) {
                boo=true;
            }
        while (boo==false){
            System.out.println("COntraseña incorrecta, intente nuevamente.");
            p1=leer.next();
            c++;
            if (p1.equals(pass)&&c!=10) {
                boo=true;
            }
        }
        System.out.println("DNI: "+dni);
        
        if (p1.equals(pass)) {
            System.out.println("Ingrese el nuevo DNI:");
            dni=leer.nextInt();
            System.out.println("Los datos se modificaron exitosamente: \n"
            +"DNI: "+dni);
        }else if(c==10){
            System.out.println("Demasiados intentos.");
        }
        return dni;
    }
}

