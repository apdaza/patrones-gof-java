/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.estructurales.bridge;

/**
 *
 * @author chamo
 */
public class ImplementorOne implements Implementor{

    @Override
    public void operation(String valor) {
        System.out.println("Operacion del implementador uno " + valor);
    }
    
}
