/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.comportamiento.interpreter;

/**
 *
 * @author daza
 */
public class ExpresionPlus extends Expresion{

    @Override
    public int evaluate() {
        return this.left.evaluate() + this.right.evaluate();
    }
    
}
