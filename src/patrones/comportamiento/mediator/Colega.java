package patrones.comportamiento.mediator;

public abstract class Colega {
    protected Mediador mediador;
    
    public Mediador getMediador(){
        return this.mediador;
    }
    
    public void setMediador( Mediador m ){
        this.mediador = m;
    }
    
    public void comunicar(String mensaje){
        this.getMediador().enviar(mensaje, this);
    }
    
    public abstract void recibir(String mensaje);
}