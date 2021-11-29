package patrones.comportamiento.visitor;

import java.util.List;
public class EquiparArma implements IVisitor{
    @Override
     public void visit( Mago m ){
        m.setArma("DAGA");
    }
    
    @Override
     public void visit( Guerrero g ){
        g.setArma("ESPADA");
    }

    @Override
     public void visit( List<IPersonaje> personajes ){
        for( IPersonaje p : personajes ){
             p.accept(this);
        }
    }
}