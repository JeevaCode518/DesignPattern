package StrategyPattern;

import StrategyPattern.behaviour.quack.Quackable;

public class RubberDuck extends Duck {

    public RubberDuck(Flyable flyable, Quackable quackable){
        this.flyable = flyable;
        this.quackable = quackable;
    }
    public void display(){
        System.out.println("Hi I am Rubber Duck");
    }
}
