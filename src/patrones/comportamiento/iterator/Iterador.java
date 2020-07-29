package patrones.comportamiento.iterator;

public interface Iterador {
    public Object primero();
    public Object siguiente();
    public boolean hayMas();
    public Object actual();
}