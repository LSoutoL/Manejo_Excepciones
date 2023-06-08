/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepciones;

/**
 *
 * @author lucia
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     * Dado el método metodoA de la clase A, indique:
a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
class A {
public void metodoA() {
sentencia_a1
sentencia_a2
try {
sentencia_a3
sentencia_a4
} catch (MioException e){
sentencia_a6
}
sentencia_a5
}
}
     */
    public static void main(String[] args) {
String a1 = "sentencia_a1",  a2= "sentencia_a2", a3 = "sentencia_a3", a5="sentencia_a5", a6 = "sentencia_a6";
String a4="sentencia_a4";
    System.out.println(a1);
    System.out.println(a2);
try {
    System.out.println(a3);
    System.out.println(a4);
} catch (Exception e){
    System.out.println(a6);
}
    System.out.println(a5);

/* a) Se reproducen 1,2,6,5.
b) Se reproducen 1,2,3,4,5
*/
}

    
}
