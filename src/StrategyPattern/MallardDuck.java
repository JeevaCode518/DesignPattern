package StrategyPattern;

import StrategyPattern.behaviour.quack.Quackable;

public class MallardDuck extends Duck {

    public MallardDuck(Flyable flyable, Quackable quackable){
        this.flyable = flyable;
        this.quackable = quackable;
    }
    public void display(){
        System.out.println("Hi!! I am MallardDuck");
    }

}
