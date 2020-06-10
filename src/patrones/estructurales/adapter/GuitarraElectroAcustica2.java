package patrones.estructurales.adapter;

public class GuitarraElectroAcustica2 extends GuitarraAcustica implements Guitarra2 {

@Override
public void onGuitar() {
        this.tocar();

    }

    @Override
    public void offGuitar() {
        this.dejar();

    }
    
}