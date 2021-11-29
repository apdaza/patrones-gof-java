/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.comportamiento.memento;

import patrones.comportamiento.iterator.*;
import patrones.Ejemplo;

/**
 *
 * @author chamo
 */
public class EjemploMemento implements Ejemplo {  

    @Override
    public void operacion() {
        
        Originator creador = new Originator("Pedro", "Gomez");
        Caretaker vigilante= new Caretaker();
        vigilante.setMemento( creador.createMemento() );
        System.out.println("Nombre completo: " + creador.getNombre() + " " + creador.getApellidos());
        creador.setNombre("Juan");
        creador.setApellidos("Baurte");
        System.out.println("Nombre completo: " + creador.getNombre() + " " + creador.getApellidos());
        creador.setMemento( vigilante.getMemento() );
        System.out.println("Nombre completo: " + creador.getNombre() + " " + creador.getApellidos());
    }
}
