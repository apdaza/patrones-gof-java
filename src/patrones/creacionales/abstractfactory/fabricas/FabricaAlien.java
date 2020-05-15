/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creacionales.abstractfactory.fabricas;

import patrones.creacionales.abstractfactory.productos.Memoria;
import patrones.creacionales.abstractfactory.productos.ProcesadorAlien;
import patrones.creacionales.abstractfactory.productos.Procesador;
import patrones.creacionales.abstractfactory.productos.Board;
import patrones.creacionales.abstractfactory.productos.BoardAlien;
import patrones.creacionales.abstractfactory.productos.MemoriaAlien;

/**
 *
 * @author chamo
 */
public class FabricaAlien implements FabricaAbstracta{

    @Override
    public Board crearBoard() {
        return new BoardAlien();
    }

    @Override
    public Memoria crearMemoria() {
        return new MemoriaAlien();
    }

    @Override
    public Procesador crearProcesador() {
        return new ProcesadorAlien();
    }

}
