/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.comportamiento.state;

import patrones.Ejemplo;

/**
 *
 * @author chamo
 */
public class EjemploState implements Ejemplo {  

    @Override
    public void operacion() {
        Semaforo objSemaforo = new Semaforo();
        
        objSemaforo.mostrar();
        objSemaforo.setEstado( new EstadoAmarillo() );
        objSemaforo.mostrar();
        objSemaforo.setEstado( new EstadoRojo() );
        objSemaforo.mostrar();
    }
}
