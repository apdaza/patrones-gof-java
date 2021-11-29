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
    Singleton objetoTres;

    @Override
    public void operacion() {
        objetoUno = Singleton.getInstancia();
        objetoDos = Singleton.getInstancia();
        /*try{
            objetoTres = new Singleton();
        }catch(Exception e){
            System.out.println("No se puede crear un objeto Singleton");
        }*/
        
        System.out.print("Comparando objetoUno == objeto2 -> ");
        System.out.println(objetoDos.equals(objetoUno));
        
        objetoUno.setValor(10);
        
        System.out.println("Valor de los objetos = " + String.valueOf(objetoDos.getValor()));
        
        objetoDos.setValor(100);
        
        System.out.println("Valor de los objetos = " + String.valueOf(objetoUno.getValor()));
    }
    
}
