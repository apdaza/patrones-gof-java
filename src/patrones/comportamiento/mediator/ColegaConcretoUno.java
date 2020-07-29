package patrones.comportamiento.mediator;

public class ColegaConcretoUno extends Colega{
    public ColegaConcretoUno(Mediador m) {
        this.setMediador( m );
    }
    // -------------------------------
    @Override
     public void recibir(String mensaje){
        System.out.println( "ColegaConcretoUno: " + mensaje );
    }
}