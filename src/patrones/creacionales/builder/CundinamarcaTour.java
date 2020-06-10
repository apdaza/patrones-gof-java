/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creacionales.builder;

/**
 *
 * @author daza
 */
public class CundinamarcaTour extends ConstructorTour{
    
    @Override
    public void construirTour() {
        tour = new Tour();
    }
    
    @Override
    public void construirHoteles() {
        tour.addHotel("NH");
        tour.addHotel("Primavera");
        tour.addHotel("Bosque escondido");
        tour.addHotel("Entre palos");
    }

    @Override
    public void construirTickets() {
        tour.addTicket("Bogota");
        tour.addTicket("La Mesa");
        tour.addTicket("Madrid");
        tour.addTicket("Mesitas");
        
    }

    
    
}
