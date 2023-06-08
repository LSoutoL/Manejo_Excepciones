/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones.objetos;

/**
 *
 * @author lucia
 */
public class MioException extends Exception {

    public MioException() {
    }

    @Override
    public String getMessage() {
        return "Error! La persona aun no ha nacido";
    }
   

    
}
