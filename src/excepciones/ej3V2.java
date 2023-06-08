/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepciones;

import excepciones.objetos.DivisionNumero;
import java.util.Scanner;

/**
 *
 * @author lucia
 */
public class ej3V2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer= new Scanner (System.in);
     DivisionNumero N=new DivisionNumero();
    
     System.out.println("Ingrese dos  nros: ");
              
     N.setN(leer.next());
     N.setN2(leer.next());
      
      int a=Integer.parseInt(N.getN());
      int b=Integer.parseInt(N.getN2());
      
        int  resultado= a/b;
        System.out.println("el resultado es: "+resultado);
    }
    
}
