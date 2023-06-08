/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepciones;

import excepciones.objetos.MioException;
import excepciones.objetos.Persona;
import excepciones.servicios.PersonaServicio;

/**
 * 
 * 
 * @author lucia
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        PersonaServicio servicio = new PersonaServicio();
        Persona p= new Persona();
        try {
           servicio.esMayorDeEdad(p.getEdad());
        } catch (MioException e){
            //System.out.println("Error! La persona aun no ha nacido.");
            System.out.println(e.getMessage());
        }
        
        
        /*
        Persona p1 = servicio.crearPersona();
        Persona p2 = servicio.crearPersona();
        Persona p3 = servicio.crearPersona();
        Persona p4 = servicio.crearPersona();
    
        boolean [] edades = new boolean [4];
        int [] IMC = new int [4];
      
        edades [0] = servicio.esMayorDeEdad(p1.getEdad());
        IMC [0]= servicio.calcularIMC(p1.getPeso(), p1.getAltura());
        edades [1] = servicio.esMayorDeEdad(p2.getEdad());
        IMC [1]= servicio.calcularIMC(p2.getPeso(),p2.getAltura());
        edades [2] = servicio.esMayorDeEdad(p3.getEdad());
        IMC [2]= servicio.calcularIMC(p3.getPeso(), p3.getAltura());
        edades [3]= servicio.esMayorDeEdad(p4.getEdad());
        //IMC [3]= servicio.calcularIMC(p4.getPeso(), p4.getAltura());
        
        servicio.porcenEdad(edades);
        servicio.porcenIMC(IMC);*/
    }
    
}
