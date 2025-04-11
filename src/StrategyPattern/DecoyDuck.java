package StrategyPattern;

public class DecoyDuck extends Duck {

    //Decoy duck cannot fly/quack so didn't implement
    public void display(){
        System.out.println("I am decoy duck");
    }
}
