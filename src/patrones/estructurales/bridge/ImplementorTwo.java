/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.estructurales.bridge;

/**
 *
 * @author chamo
 */
public class ImplementorTwo implements Implementor{
    @Override
    public void operation(String valor) {
        System.out.println(valor + " Operacion del implementador dos ");
    }
    
}
