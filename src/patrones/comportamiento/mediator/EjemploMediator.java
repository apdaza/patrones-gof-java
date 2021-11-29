/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.comportamiento.mediator;

import patrones.Ejemplo;

/**
 *
 * @author chamo
 */
public class EjemploMediator implements Ejemplo {  

    @Override
    public void operacion() {
        // Crear el objeto centralizador de la comunicación
        MediadorConcreto m = new MediadorConcreto();
        // Crear los objetos que participarán en la comunicación
        Colega colegaUno = new ColegaConcretoUno( m );
        Colega colegaDos = new ColegaConcretoDos( m );
        Colega colegaTres = new ColegaConcretoTres( m );
        // Agregarlos al objeto centralizador
         m.agregarColega( colegaUno );
         m.agregarColega( colegaDos );
         m.agregarColega( colegaTres );
        // Provocar un cambio en un uno de los elementos
        colegaDos.comunicar("ColegaConcretoDos ha cambiado!");
    }
}
