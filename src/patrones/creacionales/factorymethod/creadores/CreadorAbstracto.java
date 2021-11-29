/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creacionales.factorymethod.creadores;

import patrones.creacionales.factorymethod.productos.Producto;

/**
 *
 * @author chamo
 */
public abstract class CreadorAbstracto {
    public Producto crearProducto(){
        return factoryMethod();
    }
    
    public abstract Producto factoryMethod();
    
}
