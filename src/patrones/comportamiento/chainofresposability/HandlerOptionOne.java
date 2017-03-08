/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.comportamiento.chainofresposability;

/**
 *
 * @author daza
 */
public class HandlerOptionOne extends Handler{

    @Override
    public void handlerRequest(int opt) {
        if(opt == 1){
            System.out.println("Domingo");
        }else{
            successor.handlerRequest(opt);
        }
    }
    
}
