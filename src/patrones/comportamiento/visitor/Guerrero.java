package patrones.comportamiento.visitor;

public class Guerrero implements IPersonaje
{
    private String arma = "";

    public Guerrero() {
    }

    public String getArma()
    {
        return this.arma;
    }

    public void setArma(String arma)
    {
        this.arma = arma;
    }

    @Override
     public void accept( IVisitor visitor )
    {
         visitor.visit(this);
    }
}