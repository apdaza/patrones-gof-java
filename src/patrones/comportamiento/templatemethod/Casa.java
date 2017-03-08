/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.comportamiento.templatemethod;

/**
 *
 * @author daza
 */
public abstract class Casa {
    
    public void construirCasa(){
        crearBases();
        crearParedes();
        crearTecho();
    }
    
    public abstract void crearBases();
    public abstract void crearParedes();
    public abstract void crearTecho();
    
}
