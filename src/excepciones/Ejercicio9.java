/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepciones;

import excepciones.objetos.MioException;
import excepciones.objetos.TuException;
import java.util.InputMismatchException;

/**
 *
 * @author lucia
 * Dado el método metodoC de la clase C, indique:
a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
c) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción TuException?

class C {
void metodoC() throws TuException{
sentencia_c1
try {
sentencia_c2
sentencia_c3
} catch (MioException e){

sentencia_c4
} catch (TuException e){
sentencia_c5
throw (e)
}
finally
sentencia_c6

}
}
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    String a1 = "sentencia_c1", a3 = "sentencia_c4", a5="sentencia_a5", a6 = "sentencia_a6";
    String a4="sentencia_c2";
    String a2= "sentencia_c3";
    
    System.out.println(a1);
    
try {
    System.out.println(a4);
    System.out.println(a2);
    //int a2= Integer.parseInt("a");
} catch (NumberFormatException e){
    System.out.println(a3);
} catch (Exception e){
    System.out.println(a5);
    throw(e);
} finally {
    System.out.println(a6);
}

/*
a) 1, 4, 6
b) 1, 2, 3, 6
c) 1, 5 (+throw), 6
*/
}

}
