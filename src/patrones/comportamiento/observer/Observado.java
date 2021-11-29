package patrones.comportamiento.observer;

import java.util.ArrayList;

public abstract class Observado {
    private ArrayList<IObservador> observadores = new ArrayList<IObservador>();
    
    public void agregarObservador(IObservador o)
    {
        observadores.add(o);
        
        notificarObservadores();
    }
    
     public void eliminarObservador(IObservador o) {
        observadores.remove(o);
    }
    
     public void notificarObservadores()
    {
         for (IObservador obj : observadores) {
             obj.observadoActualizado();
        }
    }
}