/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.estructurales.proxy;

/**
 *
 * @author daza
 */
public class RealSubject implements Subject{

    @Override
    public String doAction() {
        return "Accción del RealSubject";
    }
    
}
