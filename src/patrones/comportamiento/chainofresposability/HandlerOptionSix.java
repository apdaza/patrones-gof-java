/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.comportamiento.chainofresposability;

/**
 *
 * @author daza
 */
public class HandlerOptionSix extends Handler{

    @Override
    public void handlerRequest(int opt) {
        if(opt == 6){
            System.out.println("Viernes");
        }else{
            successor.handlerRequest(opt);
        }
    }
    
}
