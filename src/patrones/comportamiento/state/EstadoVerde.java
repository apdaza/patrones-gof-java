package patrones.comportamiento.state;

public class EstadoVerde extends EstadoSemaforo
{
    
    @Override
     public void mostrar() {
        System.out.println("Luz verde");
    }
}