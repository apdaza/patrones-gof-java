/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.comportamiento.templatemethod;

import patrones.Ejemplo;

/**
 *
 * @author chamo
 */
public class EjemploTemplateMethod implements Ejemplo {

    Casa casa;

    @Override
    public void operacion() {
        casa = new CasaMadera();
        System.out.println("construir casa de madera");
        casa.construirCasa();
        casa = new CasaConcreto();
        System.out.println("construir casa de concreto");
        casa.construirCasa();
                
                

    }
}
