/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.estructurales.composite;

import patrones.Ejemplo;


/**
 *
 * @author daza
 */
public class EjemploComposite implements Ejemplo{

    @Override
    public void operacion() {
        Composite total = new Composite("Compuesto 1");
        total.addPart(new Simple("Parte 1"));
        total.addPart(new Simple("Parte 2"));
        total.addPart(new Simple("Parte 3"));
        Composite total2 = new Composite("Compuesto 2");
        total2.addPart(total);
        total2.addPart(new Simple("Parte 4"));
        System.out.println(total2.operation());
        
       
    }
    
}
