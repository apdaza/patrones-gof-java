/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creacionales.abstractfactory.fabricas;

import patrones.creacionales.abstractfactory.productos.Procesador;
import patrones.creacionales.abstractfactory.productos.Memoria;
import patrones.creacionales.abstractfactory.productos.Board;

/**
 *
 * @author chamo
 */
public interface FabricaAbstracta {

    public Board crearBoard();

    public Memoria crearMemoria();

    public Procesador crearProcesador();
}
