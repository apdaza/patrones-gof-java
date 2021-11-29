/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creacionales.singleton.pool;

import java.util.ArrayList;

/**
 *
 * @author chamo
 */
public class PoolCajeros {
    private static PoolCajeros instancia;
    private Cajero[] cajeros;
    
    private PoolCajeros(){
        cajeros = new Cajero[3];
        for(int i=0; i<3; i++)
            cajeros[i] = new Cajero(i);
        
    }
    
    public static PoolCajeros getInstancia(){
        if(instancia == null)
            instancia = new PoolCajeros();
        return instancia;
    }
    
    public Cajero getCajero(){
        for(int i=0; i<3; i++)
            if(cajeros[i].isDisponible()){
                System.out.println("asignando cajero "+cajeros[i].getNumero());
                cajeros[i].setDisponible(false);
                return cajeros[i];
            }
                
        return null;
    }
    
    public void liberarCajero(Cajero c){
        System.out.println("liberando cajero "+c.getNumero());
                
        c.setDisponible(true);
    }
    
}
