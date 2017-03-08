/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.comportamiento.chainofresposability;

/**
 *
 * @author daza
 */
public class HandlerOptionTwo extends Handler{

    @Override
    public void handlerRequest(int opt) {
        if(opt == 2){
            System.out.println("Lunes");
        }else{
            successor.handlerRequest(opt);
        }
    }
    
}
