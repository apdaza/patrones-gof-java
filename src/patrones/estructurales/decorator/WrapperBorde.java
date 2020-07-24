/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.estructurales.decorator;

/**
 *
 * @author daza
 */
public class WrapperBorde extends OptionalWrapper{

    public WrapperBorde(Component componente) {
        super(componente);
    }
    
    
    @Override
    public String doThis() {
        return componente.doThis() + " + operacion Wrapper con borde ";
    }
   
    
}
