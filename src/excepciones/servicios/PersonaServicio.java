/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones.servicios;

import excepciones.objetos.Persona;
import java.util.Scanner;

/**
 *
 * @author lucia
 */
public class PersonaServicio {
    private Persona nueva;
    private Scanner leer = new Scanner(System.in);
    
    public Persona crearPersona (){
        System.out.println("Indique el nombre de la persona");
        String nombre=leer.next();
        System.out.println("indique su edad");
        int edad = leer.nextInt();
        System.out.println("Indique su sexo: H (hombre), M (mujer) u O (otro)");
        String sexo = leer.next();
        while ((!sexo.equals("H")) && (!sexo.equals("M")) && (!sexo.equals("O"))){
            System.out.println("Valor incorrecto. Indique H (hombre), M (mujer) u O (otro)");
            sexo=leer.next();
        }
        System.out.println("Indique su peso (en kg)");
        double peso = leer.nextDouble();
        System.out.println("Indique la altura (en metros)");
        double altura = leer.nextDouble();
        return new Persona(nombre, edad, sexo, peso, altura);
    }
        
    public boolean esMayorDeEdad (int edad){ // throws Exception
        boolean mayor = true;
        if (edad<18){
             mayor=false;
        }
        //if (edad==0){
        //throw new Exception ("Error! La persona aun no ha nacido");
        //}
        return mayor;
    }
    public int calcularIMC( double peso, double altura){
        double calculo= peso/Math.pow(altura,2);
        int IMC = 2;
        
        if (calculo>25.0){
            IMC=1;
        } else if ((calculo>=20.0) && (calculo<=25.0)){
            IMC=0;
        } else if (calculo<20.0){
            IMC=-1;
        }
        return IMC;
    }
    public void porcenEdad (boolean [] edades){
        int mayor=0;
        int menor=0;
        for (int i = 0; i < 4; i++) {
            if (edades [i]==true){
                mayor++;
            } else if (edades [i]==false){
                menor++;
            }
        }
        System.out.println("El porcentaje de mayores de edad es: " + ((mayor*100)/4)+ "%");
        System.out.println("El porcentaje de menores de edad es: " + ((menor*100)/4)+ "%");
    }
    public void porcenIMC (int [] IMC){
        int bajo=0;
        int peso=0;
        int sobre=0;
        for (int i = 0; i < 4; i++) {
            switch (IMC [i]) {
                case -1:
                    bajo++;
                    break;
                case 0:
                    peso++;
                    break;
                case 1:
                    sobre++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("El porcentaje de personas con su peso ideal es: " + ((peso*100)/4) + "%");
        System.out.println("El porcentaje de personas con bajopeso es: " + ((bajo*100)/4)+ "%");
        System.out.println("El porcentaje de personas con sobrepeso es: " + ((sobre*100/4))+ "%");
    }
}
