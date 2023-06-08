/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepciones;

/**
 *
 * @author lucia
 * Dado el método metodoB de la clase B, indique:
a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
class B {
public void metodoB() {
sentencia_b1
try {
sentencia_b2
} catch (MioException e){
sentencia_b3
}
finally
sentencia_b4
}
}
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String b1 = "sentencia_b1",  b3 = "sentencia_b3", b4="sentencia_b4";
    String b2="sentencia_b2";
        System.out.println(b1);
    try{
        System.out.println(b2);
    } catch (Exception e){
        System.out.println(b3);
    } finally {
        System.out.println(b4);
    }
    /* a) 1, 3 y 4
       b) 1, 2 y 4
    */
}
}
