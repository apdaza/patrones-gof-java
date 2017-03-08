/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creacionales.factorymethod.productos;

/**
 *
 * @author chamo
 */
public class ProductoConcreto implements Producto{

    @Override
    public String operacion() {
        return "Operación del producto concreto";
    }
    
}
