/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.comportamiento.chainofresposability;

import java.util.Scanner;
import patrones.Ejemplo;

/**
 *
 * @author chamo
 */
public class EjemploChainOfResponsability implements Ejemplo {

    @Override
    public void operacion() {
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        
        Handler manejadores[] = new Handler[8];
        manejadores[7] = new HandlerOptionDefault();
        manejadores[6] = new HandlerOptionSeven();
        manejadores[5] = new HandlerOptionSix();
        manejadores[4] = new HandlerOptionFive();
        manejadores[3] = new HandlerOptionFour();
        manejadores[2] = new HandlerOptionThree();
        manejadores[1] = new HandlerOptionTwo();
        manejadores[0] = new HandlerOptionOne();
        
        for(int i=0; i<manejadores.length - 1;i++){
            manejadores[i].setSuccessor(manejadores[i+1]); ;
        }
        System.out.println("ingrese un entero: ");
        opt =  sc.nextInt();
        
        manejadores[0].handlerRequest(opt);
    }
}
