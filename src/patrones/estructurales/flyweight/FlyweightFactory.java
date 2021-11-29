/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.estructurales.flyweight;

/**
 *
 * @author paolo
 */
public class FlyweightFactory {
    private static CocreteFlyweight flyweightInstance = null;
    
    public static CocreteFlyweight getFlyweight(){
        if (flyweightInstance == null){
            flyweightInstance = new CocreteFlyweight();
        }
        return flyweightInstance;
    }
    
}
