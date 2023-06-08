
package excepciones;


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author lucia
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     * Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
    debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
    ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
    número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
    consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
    ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
    controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
    carácter fallido como un intento.
     */
    
    public static void main(String[] args) {
        
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
       int num = (int) Math.round(Math.random()*500);
       System.out.println("Adivine el numero entre 1 y 500");
       int num2=0;
       int i=0;
        do {
        try {
         num2=leer.nextInt();
         i++;
         if (num2>num){
             System.out.println("Es un numero menor");
         } else if (num2<num){
             System.out.println("Es un numero mayor");
         }
        }    catch (Exception e){
            System.out.println("Error! No es un numero y perdiste un intento.");
            leer.next();
            i++;
        } 
        } while (num2!=num);
        System.out.println("Te ha tomado " + i + " intentos.");
    }
    
}

