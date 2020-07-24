/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.comportamiento.command;

/**
 *
 * @author daza
 */
public class Programmer implements Command {

    public void execute(Receiver r) {
        r.showMessage("sell the bugs, charge extra for the fixes");
    }
}
