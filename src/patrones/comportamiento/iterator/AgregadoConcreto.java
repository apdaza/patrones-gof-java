package patrones.comportamiento.iterator;
import java.util.Vector;

public class AgregadoConcreto implements Agregado {

    protected Vector<String> datos = new Vector<String>();

    public AgregadoConcreto(){
        this.llenar();
    }

    @Override
    public Iterador getIterador() {
        return new IteradorConcreto( this );
    }

    public void llenar(){
        this.datos.add(new String("Uno"));
        this.datos.add(new String("Dos"));
        this.datos.add(new String("Tres"));
        this.datos.add(new String("Cuatro"));
        this.datos.add(new String("Cinco"));
    }
    
}