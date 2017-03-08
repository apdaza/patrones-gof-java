/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creacionales.builder;

import java.util.ArrayList;

/**
 *
 * @author daza
 */
public class Tour {
    private ArrayList<String> hoteles = new ArrayList<String>();
    private ArrayList<String> tickets = new ArrayList<String>();
    
    public void addHotel(String h){
        hoteles.add(h);
    }
    
    public void addTicket(String t){
        tickets.add(t);
    }

    public ArrayList<String> getHoteles() {
        return hoteles;
    }

    public ArrayList<String> getTickets() {
        return tickets;
    }
      
    
}
