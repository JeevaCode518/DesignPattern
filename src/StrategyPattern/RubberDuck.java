package StrategyPattern;

public class RubberDuck extends Duck implements Quackable{

    public void display(){
        System.out.println("Hi I am Rubber Duck");
    }

    @Override
    public void quack() {
        System.out.println("I am quacking");
    }
}
