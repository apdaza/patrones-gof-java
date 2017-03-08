/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.estructurales.flyweight;

import patrones.Ejemplo;

/**
 *
 * @author daza
 */
public class EjemploFlyweight implements Ejemplo{

    @Override
    public void operacion() {
        UnshareFlyweight[] flyweights = new UnshareFlyweight[10];
        for(int i=0; i<10; i++){
            flyweights[i] = new UnshareFlyweight();
            flyweights[i].setContador(i+1);
        }
        
        for(int i=0; i<10; i++){
            flyweights[i].operacion();
        }
        
        
    }
    
}
