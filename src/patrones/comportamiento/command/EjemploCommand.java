/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.comportamiento.command;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import patrones.Ejemplo;

/**
 *
 * @author chamo
 */
public class EjemploCommand implements Ejemplo {
    static Receiver receiver = new Receiver();

    @Override
    public void operacion() {
        final List queue = produceRequests();
        workOffRequests(queue);
    }

    public static List produceRequests() {
        final List queue = new ArrayList();
        queue.add(new DomesticEngineer());
        queue.add(new Politician());
        queue.add(new Programmer());
        return queue;
    }

    public static void workOffRequests(final List queue) {
        for (final Iterator it = queue.iterator(); it.hasNext();) {
            ((Command) it.next()).execute(receiver);
        }
    }
}
