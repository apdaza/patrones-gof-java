/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.estructurales.adapter;

/**
 *
 * @author daza
 */
public class GuitarraElectrica extends Guitarra {

    @Override
    public void onGuitar() {
        System.out.println("tocando guitarra");
    }

    @Override
    public void offGuitar() {
        System.out.println("cansado de tocar guitarra");
    }
}
