/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.estructurales.composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author chamo
 */
public class Composite implements Component{
    private String nombre = "";
    ArrayList<Component> parts = new ArrayList<Component>();

    @Override
    public String operation() {
        String cad = this.nombre + "[";
        for (Iterator<Component> it = parts.iterator(); it.hasNext();) {
            Component component = it.next();
            cad += component.operation() + ",";
            
        }
        cad = cad.substring(0, cad.length()-1) + "]";
        return cad;
    }
    
    public void addPart(Component c){
        parts.add(c);
    }

    public Composite(String nombre) {
        this.nombre = nombre;
    }
    
}
