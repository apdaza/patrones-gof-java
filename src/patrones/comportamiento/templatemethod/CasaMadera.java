/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.comportamiento.templatemethod;

/**
 *
 * @author daza
 */
public class CasaMadera extends Casa{

    @Override
    public void crearBases() {
        System.out.println("colocando bases de madera");
    }

    @Override
    public void crearParedes() {
        System.out.println("colocando paredes de madera");
    }

    @Override
    public void crearTecho() {
        System.out.println("colocando techo de madera");
    }
    
}
