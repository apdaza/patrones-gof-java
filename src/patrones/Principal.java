/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

import java.util.Scanner;
import patrones.comportamiento.chainofresposability.EjemploChainOfResponsability;
import patrones.comportamiento.command.EjemploCommand;
import patrones.comportamiento.interpreter.EjemploInterpreter;
import patrones.comportamiento.iterator.EjemploIterator;
import patrones.comportamiento.mediator.EjemploMediator;
import patrones.comportamiento.memento.EjemploMemento;
import patrones.comportamiento.observer.EjemploObserver;
import patrones.comportamiento.state.EjemploState;
import patrones.comportamiento.strategy.EjemploStrategy;
import patrones.comportamiento.templatemethod.EjemploTemplateMethod;
import patrones.comportamiento.visitor.EjemploVisitor;
import patrones.creacionales.abstractfactory.EjemploAbstractFactory;
import patrones.creacionales.builder.EjemploBuilder;
import patrones.creacionales.factorymethod.EjemploFactoryMethod;
import patrones.creacionales.prototype.EjemploPrototype;
import patrones.creacionales.singleton.EjemploSingleton;
import patrones.creacionales.singleton.pool.EjemploPoolCajero;
import patrones.estructurales.adapter.EjemploAdapter;
import patrones.estructurales.bridge.EjemploBridge;
import patrones.estructurales.composite.EjemploComposite;
import patrones.estructurales.decorator.EjemploDecorator;
import patrones.estructurales.facade.EjemploFacade;
import patrones.estructurales.flyweight.EjemploFlyweight;
import patrones.estructurales.proxy.EjemploProxy;

/**
 *
 * @author chamo
 */
public class Principal {

    public static void main(String[] args) {
        Ejemplo ejemplo = null;
        int opcion = 0;
        int maxOpc = 23;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Ingrese un numero entre 0 y " + maxOpc
                    + " para ver un ejemplo de patrones");
            opcion = sc.nextInt();
        } while (opcion < 0 || opcion > maxOpc);
        String patron = "";

        switch (opcion) {
            //Creacionales
            case 0:
                patron = "Singleton";
                ejemplo = new EjemploSingleton();
                break;
            case 1:
                patron = "AbstractFactory";
                ejemplo = new EjemploAbstractFactory();
                break;
            case 2:
                patron = "FactoryMethod";
                ejemplo = new EjemploFactoryMethod();
                break;
            case 3:
                patron = "Pool";
                ejemplo = new EjemploPoolCajero();
                break;
            case 4:
                patron = "Prototype";
                ejemplo = new EjemploPrototype();
                break;
            case 5:
                patron = "Builder";
                ejemplo = new EjemploBuilder();
                break;
            //Estructurales
            case 6:
                patron = "Facade";
                ejemplo = new EjemploFacade();
                break;
            case 7:
                patron = "Adapter";
                ejemplo = new EjemploAdapter();
                break;
            case 8:
                patron = "Proxy";
                ejemplo = new EjemploProxy();
                break;
            case 9:
                patron = "Decorator";
                ejemplo = new EjemploDecorator();
                break;
            case 10:
                patron = "Composite";
                ejemplo = new EjemploComposite();
                break;
            case 11:
                patron = "Bridge";
                ejemplo = new EjemploBridge();
                break;
            case 12:
                patron = "Flyweight";
                ejemplo = new EjemploFlyweight();
                break;
            //comportamiento
            case 13:
                patron = "Template Method";
                ejemplo = new EjemploTemplateMethod();
                break;
            case 14:
                patron = "Strategy";
                ejemplo = new EjemploStrategy();
                break;
            case 15:
                patron = "Interpreter";
                ejemplo = new EjemploInterpreter();
                break;
            case 16:
                patron = "Chain of responsability";
                ejemplo = new EjemploChainOfResponsability();
                break;
            case 17:
                patron = "Command";
                ejemplo = new EjemploCommand();
                break;
            //no implementados
            case 18:
                patron = "Visitor";
                ejemplo = new EjemploVisitor();
                break;
            case 19:
                patron = "State";
                ejemplo = new EjemploState();
                break;
            case 20:
                patron = "Observer";
                ejemplo = new EjemploObserver();
                break;
            case 21:
                patron = "Memento";
                ejemplo = new EjemploMemento();
                break;
            case 22:
                patron = "Mediator";
                ejemplo = new EjemploMediator();
                break;
            case 23:
                patron = "Iteraor";
                ejemplo = new EjemploIterator();
                break;
        }

        System.out.println("Patron: '" + patron + "'");
        ejemplo.operacion();

    }
}
