/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creacionales.abstractfactory.fabricas;

import patrones.creacionales.abstractfactory.productos.Memoria;
import patrones.creacionales.abstractfactory.productos.ProcesadorAmd;
import patrones.creacionales.abstractfactory.productos.Procesador;
import patrones.creacionales.abstractfactory.productos.Board;
import patrones.creacionales.abstractfactory.productos.BoardAmd;
import patrones.creacionales.abstractfactory.productos.MemoriaAmd;

/**
 *
 * @author chamo
 */
public class FabricaAmd implements FabricaAbstracta{

    @Override
    public Board crearBoard() {
        return new BoardAmd();
    }

    @Override
    public Memoria crearMemoria() {
        return new MemoriaAmd();
    }

    @Override
    public Procesador crearProcesador() {
        return new ProcesadorAmd();
    }
    
}
