/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.estructurales.bridge;

/**
 *
 * @author chamo
 */
public abstract class ExtendedAbstraction extends Abstraction {
    protected ExtendedImplementor implementor;

    public ExtendedAbstraction(ExtendedImplementor implementor) {
        super((Implementor)implementor);
        this.implementor = implementor;
    }

    public abstract void operation2();
    
}