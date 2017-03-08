/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.comportamiento.chainofresposability;

/**
 *
 * @author daza
 */
public class HandlerOptionFour extends Handler{

    @Override
    public void handlerRequest(int opt) {
        if(opt == 4){
            System.out.println("Miercoles");
        }else{
            successor.handlerRequest(opt);
        }
    }
    
}
