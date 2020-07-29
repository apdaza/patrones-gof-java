package patrones.comportamiento.memento;

public class Caretaker {
    private Memento memento;
    
     public void setMemento(Memento memento) {
        this.memento = memento;
    }
    
     public Memento getMemento() {
        return this.memento;
    }
}