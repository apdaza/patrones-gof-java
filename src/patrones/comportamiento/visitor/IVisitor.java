package patrones.comportamiento.visitor;

import java.util.List;

public interface IVisitor {
    public void visit( Mago m );
    public void visit( Guerrero g );
    public void visit( List<IPersonaje> elementList );
}