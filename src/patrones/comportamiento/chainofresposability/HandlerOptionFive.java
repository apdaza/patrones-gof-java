/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.comportamiento.chainofresposability;

/**
 *
 * @author daza
 */
public class HandlerOptionFive extends Handler{

    @Override
    public void handlerRequest(int opt) {
        if(opt == 5){
            System.out.println("Jueves");
        }else{
            successor.handlerRequest(opt);
        }
    }
    
}
