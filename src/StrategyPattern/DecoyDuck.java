package StrategyPattern;

import StrategyPattern.behaviour.quack.Quackable;

public class DecoyDuck extends Duck {

    public DecoyDuck(Flyable flyable, Quackable quackable){
        this.flyable = flyable;
        this.quackable = quackable;
    }
    //Decoy duck cannot fly/quack so didn't implement
    public void display(){
        System.out.println("I am decoy duck");
    }
}
