/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.comportamiento.visitor;

import patrones.Ejemplo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chamo
 */
public class EjemploVisitor implements Ejemplo {  

    @Override
    public void operacion() {
        Guerrero g1 = new Guerrero();
        Guerrero g2 = new Guerrero();
        Mago m1 = new Mago();
        Mago m2 = new Mago();

        List<IPersonaje> personajes = new ArrayList<IPersonaje>();

        personajes.add(g1);
        personajes.add(g2);
        personajes.add(m1);
        personajes.add(m2);

        IVisitor visitorArma = new EquiparArma();
        visitorArma.visit( personajes );
        
        
        System.out.println( "Arma del guerrero g1: " + g1.getArma() );
        System.out.println( "Arma del guerrero g2: " + g2.getArma() );
        System.out.println( "Arma del mago m1: " + m1.getArma() );
        System.out.println( "Arma del mago m1: " + m2.getArma() );
    }
}
