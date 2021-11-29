/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.estructurales.flyweight;

/**
 *
 * @author paolo
 */
public class CocreteFlyweight implements Flyweight{

    @Override
    public void operacion() {
        System.out.print("Operacion del peso ligero concreto");
    }
    
}
