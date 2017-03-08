/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creacionales.factorymethod.creadores;

import patrones.creacionales.factorymethod.productos.Producto;
import patrones.creacionales.factorymethod.productos.ProductoConcreto;

/**
 *
 * @author chamo
 */
public class CreadorConcreto extends CreadorAbstracto{

    @Override
    public Producto factoryMethod() {
        return new ProductoConcreto();
    }
    
}
