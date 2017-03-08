/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.estructurales.decorator;

/**
 *
 * @author daza
 */
public class RealComponent implements Component{

    @Override
    public String doThis() {
        return "Operación del objeto real";
    }
    
}
