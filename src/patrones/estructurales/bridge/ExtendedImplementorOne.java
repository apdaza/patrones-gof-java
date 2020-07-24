/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.estructurales.bridge;

/**
 *
 * @author chamo
 */
public class ExtendedImplementorOne implements ExtendedImplementor{

    @Override
    public void operation(String valor) {
        System.out.println("Operacion del implementador uno " + valor);
    }

    @Override
    public void operation2(String valor) {
        System.out.println("Operacion2 del implementador uno " + valor);

    }
    
}
