/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.estructurales.proxy;

import patrones.Ejemplo;

/**
 *
 * @author daza
 */
public class EjemploProxy implements Ejemplo{

    @Override
    public void operacion() {
        Proxy p = new Proxy();
        for(int i=0; i<10; i++)
            System.out.println(p.doAction());
    }
    
}
