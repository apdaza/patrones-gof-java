/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.comportamiento.command;

/**
 *
 * @author daza
 */
public class Politician implements Command {

    public void execute(Receiver r) {
        r.showMessage("take money from the rich, take votes from the poor");
    }
}
