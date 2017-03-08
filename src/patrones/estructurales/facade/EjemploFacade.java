/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.estructurales.facade;

import patrones.Ejemplo;

/**
 *
 * @author daza
 */
public class EjemploFacade implements Ejemplo{

    @Override
    public void operacion() {
        FachadaLibreria libreria = new FachadaLibreria();
        System.out.println(libreria.buscarLibros());
        System.out.println(libreria.buscarMusica());
        System.out.println(libreria.buscarVideos());
    }
    
}
