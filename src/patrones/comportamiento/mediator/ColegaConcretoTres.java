package patrones.comportamiento.mediator;

public class ColegaConcretoTres extends Colega{
    public ColegaConcretoTres(Mediador m) {
        this.setMediador( m );
    }
    // -------------------------------
    @Override
     public void recibir(String mensaje){
        System.out.println( "ColegaConcretoTres: " + mensaje );
    }
}