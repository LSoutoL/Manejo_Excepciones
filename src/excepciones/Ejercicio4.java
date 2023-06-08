/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author lucia
 * Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
utilizando bloques try/catch para las distintas excepciones
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros");
        try{
        String num = leer.next();
        String num1 = leer.next();
        double n = Integer.parseInt(num)/Integer.parseInt(num1);
        System.out.println("La division entre los numeros es " + n);
        } catch (InputMismatchException e){
            System.out.println("Error, el valor ingresado no es un carcater");
        } catch (NumberFormatException e){
            System.out.println("Error, el valor ingresado no puede ser convertido a numero entero");
        } catch (ArithmeticException e){
            System.out.println("Error, no se puede dividir por cero");
        } catch (Exception e){
            System.out.println("Error imprevisto");
        }
    }
    
}
