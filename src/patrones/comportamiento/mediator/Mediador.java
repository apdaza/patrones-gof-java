package patrones.comportamiento.mediator;

public interface Mediador {
    public void enviar(String mensaje, Colega emisor);
}