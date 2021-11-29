package patrones.comportamiento.mediator;

import java.util.ArrayList;

public class MediadorConcreto implements Mediador {

    private ArrayList<Colega> colegas;

    public MediadorConcreto(){
        this.colegas = new ArrayList<Colega>();
    }

    @Override
    public void enviar(String mensaje, Colega emisor) {
        for( Colega colega : colegas ){
            if( colega != emisor ){
                colega.recibir( mensaje );
            }
        }

    }

    public void agregarColega(Colega colega){
        this.colegas.add( colega );
    }
    
    
}