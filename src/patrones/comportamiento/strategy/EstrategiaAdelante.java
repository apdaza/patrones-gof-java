/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.comportamiento.strategy;

/**
 *
 * @author daza
 */
public class EstrategiaAdelante extends Strategy{

    @Override
    public void llenado() {
        for(int i = 0; i < arreglo.length; i++){
            arreglo[i] = generarAleatorio();
            System.out.println("generando aleatorio para la poscion " + i + " = " + arreglo[i]);
        }
    }
    
}
