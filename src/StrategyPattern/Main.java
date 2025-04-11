package StrategyPattern;

import StrategyPattern.behaviour.fly.FlyWithWings;

public class Main {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck(new FlyWithWings());
        mallardDuck.eat();
        mallardDuck.display();
        mallardDuck.performFly();

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.eat();
        rubberDuck.quack();
    }
}
