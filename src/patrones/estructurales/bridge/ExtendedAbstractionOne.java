/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.estructurales.bridge;

/**
 *
 * @author chamo
 */
public class ExtendedAbstractionOne extends ExtendedAbstraction{
    private String valor;

    public ExtendedAbstractionOne(String valor, ExtendedImplementor implementor) {
        super(implementor);
        this.valor = valor;
    }
    
    @Override
    public void operation() {
        implementor.operation(valor);
    }

    @Override
    public void operation2() {
        implementor.operation2(valor);

    }
    
}
