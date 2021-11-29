package patrones.comportamiento.state;

public class Semaforo {
    private EstadoSemaforo objEstadoSemaforo;
    
    public Semaforo() {
         this.objEstadoSemaforo = new EstadoVerde();
    }
    
     public void setEstado( EstadoSemaforo objEstadoSemaforo ) {
         this.objEstadoSemaforo = objEstadoSemaforo;
    }
    
    public void mostrar() {
        this.objEstadoSemaforo.mostrar();
    }
}