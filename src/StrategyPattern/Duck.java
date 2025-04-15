package StrategyPattern;

import StrategyPattern.behaviour.quack.Quackable;

public class Duck {

    Flyable flyable;
    Quackable quackable;

    public void eat(){
        System.out.println("Duck Eats");
    }

    public void performFly(){
        flyable.fly();
    }

    public void performQuack(){
        quackable.quack();
    }

    public void updateFlyBehaviour(Flyable flyable){
        this.flyable = flyable;
    }
}
