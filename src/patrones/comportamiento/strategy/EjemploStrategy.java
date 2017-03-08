/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.comportamiento.strategy;

import patrones.Ejemplo;

/**
 *
 * @author chamo
 */
public class EjemploStrategy implements Ejemplo {

    Strategy arreglo;

    @Override
    public void operacion() {
        arreglo = new EstrategiaAdelante();
        System.out.println("llenado hacia adelante");
        arreglo.llenado();
        arreglo = new EstrategiaAtras();
        System.out.println("llenado hacia atras");
        arreglo.llenado();
                
                

    }
}
