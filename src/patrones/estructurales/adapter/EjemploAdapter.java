/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.estructurales.adapter;

import patrones.Ejemplo;

/**
 *
 * @author daza
 */
public class EjemploAdapter implements Ejemplo{

    @Override
    public void operacion() {
        System.out.println("Guitarra Electrica");
        Guitarra eGuitarra = new GuitarraElectrica();
        eGuitarra.onGuitar();
        eGuitarra.offGuitar();
        
        System.out.println("Guitarra ElectroAcustica");
        Guitarra eaGuitarra = new GuitarraElectroAcustica();
        eaGuitarra.onGuitar();
        eaGuitarra.offGuitar();

        System.out.println("Guitarra Electroacustica 2");
        Guitarra2 eaGuitarra2 = new GuitarraElectroAcustica2();
        eaGuitarra2.onGuitar();
        eaGuitarra2.offGuitar();
    }
    
}
