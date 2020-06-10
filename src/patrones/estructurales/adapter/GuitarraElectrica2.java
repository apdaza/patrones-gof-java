package patrones.estructurales.adapter;

public class GuitarraElectrica2 implements Guitarra2{

    @Override
    public void onGuitar() {
        System.out.println("tocando guitarra");

    }

    @Override
    public void offGuitar() {
        System.out.println("dejando guitarra");

    }
    
}