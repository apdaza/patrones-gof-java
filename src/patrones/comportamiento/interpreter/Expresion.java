/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.comportamiento.interpreter;

/**
 *
 * @author daza
 */
public abstract class Expresion {
    protected String value;
    protected Expresion right;
    protected Expresion left;
    
    abstract public int evaluate();

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Expresion getRight() {
        return right;
    }

    public void setRight(Expresion right) {
        this.right = right;
    }

    public Expresion getLeft() {
        return left;
    }

    public void setLeft(Expresion left) {
        this.left = left;
    }
    
    
    
}
