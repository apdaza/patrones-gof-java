package patrones.comportamiento.memento;

public class Originator {
    private String nombre;
     private String apellidos;
    
     public Originator(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    
     public void setMemento(Memento m) {
        this.nombre = m.getNombre();
        this.apellidos = m.getApellidos();
    }
    
     public Memento createMemento() {
        return new Memento(nombre, apellidos);
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}