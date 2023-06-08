/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepciones;

/**
 *
 * @author lucia
 * class B {
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
public class Ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a1 = "sentencia_b1",  a4= "sentencia_b4", a3 = "sentencia_b3", a5="sentencia_b5", a6 = "sentencia_a6";
        String a2="sentencia_b2";
    System.out.println(a1);
    
try {
    System.out.println(a2);
} catch (Exception e){
    System.out.println(a3);
    
} finally {
    System.out.println(a4);
    }
}
}
