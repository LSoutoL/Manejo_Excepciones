/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones.objetos;

/**
 *
 * @author lucia
 */
public class Clase1 {
    private String [] canciones;

    public Clase1() {
        this.canciones=new String [3];
    }

    public Clase1(String[] canciones) {
        this.canciones = canciones;
    }

    public String[] getCanciones() {
        return canciones;
    }

    public void setCanciones(String[] canciones) throws Exception {
        try{
            for (int i = 0; i < canciones.length; i++) {
                this.canciones[i]=canciones[i];
            }
        this.canciones = canciones;
        } catch (ArrayIndexOutOfBoundsException e){
            throw new Exception ("Error. El listado no puede contener mas de tres elementos");
        }
    }
    
    
}
