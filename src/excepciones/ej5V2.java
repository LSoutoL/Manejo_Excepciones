/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepciones;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lucia
 */
public class ej5V2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    
     Scanner leer = new Scanner(System.in);
     Random random = new Random();
        int contCantVeces = 0;
        int aux = 0;
        int random1 = random.nextInt(500) + 1;

        while (aux != random1) {

            System.out.println("Adivine el número:");

            try {
                aux = leer.nextInt();
                contCantVeces++;

                if (aux < random1) {
                    System.out.println("El número es mayor.");
                } else if (aux > random1) {
                    System.out.println("El número es menor.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Ingresaste un caracter inválido.");
                leer.nextLine(); // Limpiar el búfer de entrada*
                contCantVeces++;
            }
        }
        System.out.println("¡Adivinaste! Lo intentaste " + contCantVeces + " veces.");
    }
}
