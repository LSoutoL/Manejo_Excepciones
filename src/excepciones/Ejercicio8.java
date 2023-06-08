/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepciones;

/**
 *
 * @author lucia
 * Indique que se mostrará por pantalla cuando se ejecute cada una de estas clases:
class Uno{
private static int metodo() {
int valor=0;
try {
valor = valor+1;
valor = valor + Integer.parseInt (”42”);
valor = valor +1;
System.out.println(”Valor final del try:” + valor) ;
} catch (NumberFormatException e) {
Valor = valor + Integer.parseInt(”42”);
System.out.println(“Valor final del catch:” + valor);
} finally {
valor = valor + 1;
System.out.println(”Valor final del finally: ” + valor) ;
}
valor = valor +1;
System.out.println(”Valor antes del return: ” + valor) ;
return valor;
}

public static void main (String[] args) {
try {
System.out.println (metodo()) ;
}catch(Exception e) {
System.err.println(”Excepcion en metodo() ”) ;
e.printStackTrace();
}
}
}
class Dos{
private static int metodo() {
int valor=0;
try{
valor = valor + 1;
valor = valor + Integer.parseInt (”W”);
valor = valor + 1;
System.out.println(”Valor final del try: ” + valor) ;
} catch ( NumberFormatException e ) {
valor = valor + Integer.parseInt (”42”);
System.out.println(”Valor final del catch: ” + valor) ;
} finally {
valor = valor + 1;
System.out.println(”Valor final del finally: ” + valor) ;
}
valor = valor + 1;
System.out.println(”Valor antes del return: ” + valor) ;
return valor;
}
public static void main (String[] args) {
try{
System.out.println ( metodo ( ) ) ;
} catch(Exception e) {
System.err.println ( ” Excepcion en metodo ( ) ” ) ;
e.printStackTrace();
}
}
}

class Tres{
private static int metodo( ) {
int valor=0;
try{
valor = valor + 1;
valor = valor + Integer.parseInt (”W”);
valor = valor + 1;
System.out.println(”Valor final del try: ” + valor);
} catch(NumberFormatException e) {
valor = valor + Integer.parseInt (”W”);
System.out.println(”Valor final del catch: ” + valor);
} finally{
valor = valor + 1;
System.out.println(”Valor final del finally:” + valor);
}
valor = valor + 1;
System.out.println(”Valor antes del return: ” + valor) ;
return valor;
}
public static void main (String[] args) {
try{
System.out.println( metodo ( ) ) ;
} catch(Exception e) {
System.err.println(”Excepcion en metodo ( ) ” ) ;
e.printStackTrace();
}
}
}
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
public static void main (String[] args) {
try {
System.out.println (metodo()) ;
}catch(Exception e) {
System.err.println( "Excepcion en metodo() ") ;
e.printStackTrace();
}
}    
        
private static int metodo() {
int valor=0;
try {
    valor = valor+1;
    valor = valor + Integer.parseInt ("");
    valor = valor +1;
    System.out.println("Valor final del try:" + valor) ;
} catch (NumberFormatException e) {
    valor = valor + Integer.parseInt("");
    System.out.println("Valor final del catch:" + valor);
} finally {
valor = valor + 1;
System.out.println("Valor final del finally: " + valor) ;
}

valor = valor +1;
System.out.println("Valor antes del return: " + valor) ;
return valor;
}
     /* Clase Uno
        "Valor final del try:44"
        "Valor final del finally:45"
        "Valor antes del return:46"
        "46"

        Clase Dos
       
        "Valor final del catch:43"
        "Valor final del finally:44"
        "Valor antes del return:45"

        Clase Tres
        "Valor final del finally:2"
        "Excepcion en metodo() "
        java.lang.NumberFormatException: For input string: "W"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
	at java.base/java.lang.Integer.parseInt(Integer.java:665)
	at java.base/java.lang.Integer.parseInt(Integer.java:781)
	at excepciones.Ejercicio8.metodo(Ejercicio8.java:120)
	at excepciones.Ejercicio8.main(Ejercicio8.java:105)
        */
}
    

