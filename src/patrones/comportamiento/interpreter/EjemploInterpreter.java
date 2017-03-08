/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.comportamiento.interpreter;

import patrones.comportamiento.strategy.*;
import patrones.Ejemplo;

/**
 *
 * @author chamo
 */
public class EjemploInterpreter implements Ejemplo {

    Expresion raiz;

    @Override
    public void operacion() {
        raiz = new ExpresionPlus();
        raiz.setLeft(new ExpresionNumber());
        raiz.getLeft().setValue("15");
        raiz.setRight(new ExpresionMinus());
        raiz.getRight().setLeft(new ExpresionNumber());
        raiz.getRight().getLeft().setValue("25");
        raiz.getRight().setRight(new ExpresionNumber());
        raiz.getRight().getRight().setValue("5");
        System.out.println(raiz.evaluate());
    }
}
