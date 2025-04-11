package StrategyPattern;

public class Duck {

    Flyable flyable;

    public void eat(){
        System.out.println("Duck Eats");
    }

    public void performFly(){
        flyable.fly();
    }
}
