package StrategyPattern;

public class MallardDuck extends Duck {

    public MallardDuck(Flyable flyable){
        this.flyable = flyable;
    }
    public void display(){
        System.out.println("Hi!! I am MallardDuck");
    }

}
