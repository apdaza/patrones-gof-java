/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creacionales.singleton;

import patrones.Ejemplo;

/**
 *
 * @author chamo
 */
public class EjemploSingleton implements Ejemplo{
    Singleton objetoUno;
    Singleton objetoDos;

    @Override
    public void operacion() {
        objetoUno = Singleton.getInstancia();
        objetoDos = Singleton.getInstancia();
        
        System.out.print("Comparando objetoUno == objeto2 -> ");
        System.out.println(objetoDos.equals(objetoUno));
        
        objetoUno.setValor(10);
        
        System.out.println("Valor de los objetos = " + String.valueOf(objetoDos.getValor()));
        
        objetoDos.setValor(100);
        
        System.out.println("Valor de los objetos = " + String.valueOf(objetoUno.getValor()));
    }
    
}
