/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.estructurales.bridge;

import patrones.Ejemplo;

/**
 *
 * @author daza
 */
public class EjemploBridge implements Ejemplo{

    @Override
    public void operacion() {
        Abstraction abstraction = new AbstractionOne("prueba", new ImplementorOne());
        abstraction.operation();
        abstraction = new AbstractionOne("prueba", new ImplementorTwo());
        abstraction.operation();
    }
    
}
