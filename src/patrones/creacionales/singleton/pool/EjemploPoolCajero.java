/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creacionales.singleton.pool;

import patrones.Ejemplo;

/**
 *
 * @author chamo
 */
public class EjemploPoolCajero implements Ejemplo{
    Cajero cajeroUno;
    Cajero cajeroDos;
    Cajero cajeroTres;
    Cajero cajeroCuatro;
    
    PoolCajeros poolUno;
    PoolCajeros poolDos;
    
    @Override
    public void operacion() {
        poolUno = PoolCajeros.getInstancia();
        poolDos = PoolCajeros.getInstancia();
        
        cajeroUno = poolUno.getCajero();
        System.out.println(cajeroUno.getNumero());
        
        cajeroDos = poolDos.getCajero();
        System.out.println(cajeroDos.getNumero());
        
        cajeroTres = poolUno.getCajero();
        System.out.println(cajeroTres.getNumero());
        
        poolDos.liberarCajero(cajeroDos);
        
        cajeroCuatro = poolDos.getCajero();
        System.out.println(cajeroCuatro.getNumero());
        
        
    }
    
}
