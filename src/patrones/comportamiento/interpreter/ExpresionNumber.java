/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.comportamiento.interpreter;

/**
 *
 * @author daza
 */
public class ExpresionNumber extends Expresion{

    @Override
    public int evaluate() {
        return Integer.parseInt(this.value);
    }
    
}
