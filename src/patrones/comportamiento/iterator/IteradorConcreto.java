package patrones.comportamiento.iterator;

public class IteradorConcreto implements Iterador {

    private final AgregadoConcreto agregado;
    private int posicionActual = 0;

    public IteradorConcreto(final AgregadoConcreto agregado) {
        this.agregado = agregado;
    }
    

    @Override
    public Object primero() {
        Object obj = null;
        if( this.agregado.datos.isEmpty() == false ){
            this.posicionActual = 0;
            obj = this.agregado.datos.firstElement();
        }
        return obj;
        
    }

    @Override
    public Object siguiente() {
        Object obj = null;
        if( (this.posicionActual ) < this.agregado.datos.size() ){
            obj = this.agregado.datos.elementAt(this.posicionActual);
            this.posicionActual += 1;
        }
        return obj;
    }

    @Override
    public boolean hayMas() {
        boolean ok = false;
        if( this.posicionActual < (this.agregado.datos.size() ) ){
            ok = true;
        }
        return ok;
    }

    @Override
    public Object actual() {
        Object obj = null;
        if( this.posicionActual < this.agregado.datos.size() )
        {
            obj = this.agregado.datos.elementAt( this.posicionActual );
        }
        return obj;
    }

    
    
}