/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.comportamiento.chainofresposability;

/**
 *
 * @author daza
 */
public class HandlerOptionThree extends Handler{

    @Override
    public void handlerRequest(int opt) {
        if(opt == 3){
            System.out.println("Martes");
        }else{
            successor.handlerRequest(opt);
        }
    }
    
}
