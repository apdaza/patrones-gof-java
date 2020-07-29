/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.comportamiento.iterator;

import patrones.Ejemplo;

/**
 *
 * @author chamo
 */
public class EjemploIterator implements Ejemplo {  

    @Override
    public void operacion() {
        try
        {
            AgregadoConcreto agregado = new AgregadoConcreto();
            Iterador iterador = agregado.getIterador();
            String obj = (String) iterador.primero();
            System.out.println( obj );
            iterador.siguiente();
            iterador.siguiente();
            System.out.println( (String) iterador.actual() + "\n" );
            iterador.primero();
            while( iterador.hayMas() == true ) {
                System.out.println( iterador.siguiente() );
            }
        }
        catch( Exception e )
        {
            e.printStackTrace();
        }
    }
}
