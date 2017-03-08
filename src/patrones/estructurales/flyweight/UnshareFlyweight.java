/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.estructurales.flyweight;

/**
 *
 * @author paolo
 */
public class UnshareFlyweight implements Flyweight{
    private CocreteFlyweight flyweightInstnce = FlyweightFactory.getFlyweight();
    private int contador = 0;

    @Override
    public void operacion() {
        flyweightInstnce.operacion();
        System.out.println(" con estado propio de conteo en " + contador);
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
    
    
}
