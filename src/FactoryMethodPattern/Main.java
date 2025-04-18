package FactoryMethodPattern;

import FactoryMethodPattern.Component.Animal;
import FactoryMethodPattern.Decorator.AnimalDecorator;
import FactoryMethodPattern.Decorator.RandomAnimalDecorator;
import StrategyPattern.DecoyDuck;

public class Main {

    public static void main(String[] args) {

        AnimalDecorator animalDecorator = new RandomAnimalDecorator();

        for(int i = 0; i< 3; i++){
            animalDecorator.generateAnimal().sound();
        }
    }
}
