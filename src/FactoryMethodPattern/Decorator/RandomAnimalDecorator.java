package FactoryMethodPattern.Decorator;

import FactoryMethodPattern.Component.Animal;
import FactoryMethodPattern.Component.Cat;
import FactoryMethodPattern.Component.Dog;
import FactoryMethodPattern.Component.Duck;

public class RandomAnimalDecorator implements AnimalDecorator{

    public Animal generateAnimal(){
        int randomNum = (int) (Math.random() * 30);
        if(randomNum <= 10)
            return new Cat();
        else if(randomNum <= 20){
            return new Dog();
        }else{
            return new Duck();
        }
    }
}
