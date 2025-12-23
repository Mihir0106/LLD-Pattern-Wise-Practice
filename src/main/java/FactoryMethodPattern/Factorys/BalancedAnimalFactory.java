package FactoryMethodPattern.Factorys;

import FactoryMethodPattern.Animals.Cat;
import FactoryMethodPattern.Animals.Dog;
import FactoryMethodPattern.Animals.Duck;
import FactoryMethodPattern.Interfaces.Animal;
import FactoryMethodPattern.Interfaces.AnimalFactory;

import java.util.Random;
import java.util.zip.Deflater;

public class BalancedAnimalFactory implements AnimalFactory {
    int num = 0;
    @Override
    public Animal createAnimal() {
        num++;
        return switch (num%3){
            case 0 -> new Dog();
            case 1 -> new Cat();
            case 2 -> new Duck();
            default -> null;
        };

    }
}
