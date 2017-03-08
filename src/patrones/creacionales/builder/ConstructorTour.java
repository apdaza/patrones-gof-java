/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creacionales.builder;

/**
 *
 * @author daza
 */
public abstract class ConstructorTour {
    protected Tour tour;

    public Tour getTour() {
        return tour;
    }
    
    public abstract void construirTour();
    public abstract void construirHoteles();
    public abstract void construirTickets();
}
