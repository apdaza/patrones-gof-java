/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.estructurales.composite;

/**
 *
 * @author chamo
 */
public class Simple implements Component{
    private String nombre = "";
    
    @Override
    public String operation() {
        return this.nombre;
    }

    public Simple(String nombre) {
        this.nombre = nombre;
    }

    
    
}
