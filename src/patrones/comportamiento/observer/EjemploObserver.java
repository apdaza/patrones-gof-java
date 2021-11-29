/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.comportamiento.observer;

import patrones.comportamiento.iterator.*;
import patrones.Ejemplo;

/**
 *
 * @author chamo
 */
public class EjemploObserver implements Ejemplo {  

    @Override
    public void operacion() {
        UnObservado objObservado = new UnObservado();
        // Instanciar y registrar un Observador
         UnObservador objObservadorPepe  = new UnObservador("Pepe");
         objObservado.agregarObservador(objObservadorPepe);
        // Instanciar y registrar otro Observador
        UnObservador objObservadorJuan  = new UnObservador("Juan");
        objObservado.agregarObservador(objObservadorJuan);
        // Instanciar y registrar otro Observador
        UnObservador objObservadorMarta = new UnObservador("Marta");
        objObservado.agregarObservador(objObservadorMarta);
    }
}
