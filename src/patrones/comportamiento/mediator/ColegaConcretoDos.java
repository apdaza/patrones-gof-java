package patrones.comportamiento.mediator;

public class ColegaConcretoDos extends Colega{
    public ColegaConcretoDos(Mediador m) {
        this.setMediador( m );
    }
    // -------------------------------
    @Override
     public void recibir(String mensaje){
        System.out.println( "ColegaConcretoDos: " + mensaje );
    }
}