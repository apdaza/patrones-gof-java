/*
 * Director del patron
 */
package patrones.creacionales.builder;

/**
 * 
 * @author daza
 */
public class Agencia {
    private ConstructorTour constructor;

    public void setConstructor(ConstructorTour constructor) {
        this.constructor = constructor;
    }
    
    public Tour getTour(){
        return constructor.getTour();
    }
    
    public void construirTour(){
        constructor.construirTour();
        constructor.construirHoteles();
        constructor.construirTickets();
    }
    
}
