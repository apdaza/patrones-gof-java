/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.estructurales.decorator;

/**
 *
 * @author daza
 */
public class WrapperUno extends OptionalWrapper{

    public WrapperUno(Component componente) {
        super(componente);
    }
    
    
    @Override
    public String doThis() {
        return componente.doThis() + " + operacion WrapperUno ";
    }
   
    
}
