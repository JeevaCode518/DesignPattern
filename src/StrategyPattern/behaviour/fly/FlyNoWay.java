package StrategyPattern.behaviour.fly;

import StrategyPattern.Flyable;

public class FlyNoWay implements Flyable {
    @Override
    public void fly() {
        System.out.println("I cannot fly");
    }
}
