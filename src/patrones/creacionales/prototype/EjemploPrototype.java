/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creacionales.prototype;

import patrones.creacionales.prototype.fabrica.AnimalCreator;
import patrones.creacionales.prototype.prototipos.Animal;
import patrones.Ejemplo;

/**
 *
 * @author daza
 */
public class EjemploPrototype implements Ejemplo {

    @Override
    public void operacion() {
        AnimalCreator animalCreator = new AnimalCreator();
        Animal[] animalFarm = new Animal[8];
        animalFarm[0] = animalCreator.retrieveAnimal("Chicken");
        animalFarm[1] = animalCreator.retrieveAnimal("Chicken");
        animalFarm[2] = animalCreator.retrieveAnimal("Chicken");
        animalFarm[3] = animalCreator.retrieveAnimal("Chicken");
        animalFarm[4] = animalCreator.retrieveAnimal("Sheep");
        animalFarm[5] = animalCreator.retrieveAnimal("Sheep");
        animalFarm[6] = animalCreator.retrieveAnimal("Sheep");
        animalFarm[7] = animalCreator.retrieveAnimal("Sheep");
        for (int i = 0; i <= 7; i++) {
            System.out.println(animalFarm[i].helloAnimal());
        }
        animalFarm[4].changeOwner("Miguel");
        for (int i = 0; i <= 7; i++) {
            System.out.println(animalFarm[i].helloAnimal());
        }
    }
}
