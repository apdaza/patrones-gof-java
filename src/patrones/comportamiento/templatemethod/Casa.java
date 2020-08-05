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
        limpiarTerreno();
        crearBases();
        crearParedes();
        crearTecho();
    }

    public void limpiarTerreno() {
        System.out.println("Limpiando el terreno para construir la casa");
    }
    
    public abstract void crearBases();
    public abstract void crearParedes();
    public abstract void crearTecho();
    
}
