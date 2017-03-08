/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creacionales.factorymethod;

import patrones.Ejemplo;
import patrones.creacionales.factorymethod.creadores.CreadorAbstracto;
import patrones.creacionales.factorymethod.creadores.CreadorConcreto;
import patrones.creacionales.factorymethod.productos.Producto;

/**
 *
 * @author chamo
 */
public class EjemploFactoryMethod implements Ejemplo{
    CreadorAbstracto creador;
    Producto producto;
    @Override
    public void operacion() {
        creador = new CreadorConcreto();
        producto = creador.crearProducto();
        System.out.println(producto.operacion());
    }
    
}
