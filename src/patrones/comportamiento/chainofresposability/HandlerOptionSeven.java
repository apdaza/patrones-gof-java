/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.comportamiento.chainofresposability;

/**
 *
 * @author daza
 */
public class HandlerOptionSeven extends Handler{

    @Override
    public void handlerRequest(int opt) {
        if(opt == 7){
            System.out.println("Sabado");
        }else{
            successor.handlerRequest(opt);
        }
    }
    
}
