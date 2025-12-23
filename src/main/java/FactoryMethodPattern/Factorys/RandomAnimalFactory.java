package FactoryMethodPattern.Factorys;

import FactoryMethodPattern.Animals.Cat;
import FactoryMethodPattern.Animals.Dog;
import FactoryMethodPattern.Animals.Duck;
import FactoryMethodPattern.Interfaces.Animal;
import FactoryMethodPattern.Interfaces.AnimalFactory;

import java.util.Random;

public class RandomAnimalFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        Random random = new Random();
        int num = random.nextInt(0,3);

        return switch (num) {
            case 0 -> new Dog();
            case 1 -> new Cat();
            case 2 -> new Duck();
            default -> null;
        };
    }
}
