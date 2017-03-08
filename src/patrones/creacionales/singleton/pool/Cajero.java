/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creacionales.singleton.pool;

/**
 *
 * @author chamo
 */
public class Cajero {
    private int numero;
    private boolean disponible;
    
    public Cajero(int n){
        numero = n;
        disponible = true;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
    
}
