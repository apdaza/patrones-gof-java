/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.estructurales.bridge;

/**
 *
 * @author chamo
 */
public class AbstractionOne extends Abstraction{
    private String valor;

    public AbstractionOne(String valor, Implementor implementor) {
        super(implementor);
        this.valor = valor;
    }
    
    @Override
    public void operation() {
        implementor.operation(valor);
    }
    
}
