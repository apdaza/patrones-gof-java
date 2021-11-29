/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.comportamiento.chainofresposability;

/**
 *
 * @author daza
 */
public class HandlerOptionDefault extends Handler{

    @Override
    public void handlerRequest(int opt) {
        System.out.println("No es una opcion valida");
    }
    
}
