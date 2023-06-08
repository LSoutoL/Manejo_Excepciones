/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepciones;

import excepciones.objetos.Clase1;

/**
 *
 * @author lucia
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     * Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
        generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
        de rango).
     */
    public static void main(String[] args) {
       Clase1 c = new Clase1();
       String [] canciones = new String [4];
        for (int i = 0; i < 4; i++) {
            canciones[i]= "a";
        }
        try{
        c.setCanciones(canciones);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
