/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creacionales.singleton;

import patrones.Ejemplo;

/**
 *
 * @author chamo
 */
public class EjemploSingleton implements Ejemplo{
    Singleton objetoUno;
    Singleton objetoDos;

    @Override
    public void operacion() {
        objetoUno = Singleton.getInstancia();
        objetoDos = Singleton.getInstancia();
        
        System.out.println(objetoDos.equals(objetoUno));
    }
    
}
