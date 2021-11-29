/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creacionales.abstractfactory.fabricas;

import patrones.creacionales.abstractfactory.productos.Memoria;
import patrones.creacionales.abstractfactory.productos.Procesador;
import patrones.creacionales.abstractfactory.productos.Board;
import patrones.creacionales.abstractfactory.productos.BoardIntel;
import patrones.creacionales.abstractfactory.productos.MemoriaIntel;
import patrones.creacionales.abstractfactory.productos.ProcesadorIntel;

/**
 *
 * @author chamo
 */
public class FabricaIntel implements FabricaAbstracta{
    
    @Override
    public Board crearBoard() {
        return new BoardIntel();
    }

    @Override
    public Memoria crearMemoria() {
        return new MemoriaIntel();
    }

    @Override
    public Procesador crearProcesador() {
        return new ProcesadorIntel();
    }
}
