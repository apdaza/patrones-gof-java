package patrones.comportamiento.state;

public class EstadoAmarillo extends EstadoSemaforo
{
    
    @Override
     public void mostrar() {
        System.out.println("Luz amarilla");
    }
}