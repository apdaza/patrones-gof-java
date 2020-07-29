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
            // Crear el objeto agregado que contiene la lista (un vector en este ejemplo)
            AgregadoConcreto agregado = new AgregadoConcreto();
            // Crear el objeto iterador para recorrer la lista
            Iterador iterador = agregado.getIterador();
            // Mover una posición adelante y mostrar el elemento
            String obj = (String) iterador.primero();
            System.out.println( obj );
            // Mover dos posiciones adelante
            iterador.siguiente();
            iterador.siguiente();
            // Mostrar el elemento actual
            System.out.println( (String) iterador.actual() + "\n" );
            // Volver al principio
            iterador.primero();
            // Recorrer todo
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
