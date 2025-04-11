package StrategyPattern.behaviour.fly;

import StrategyPattern.Flyable;

public class FlyWithWings implements Flyable {
    @Override
    public void fly() {
        System.out.println("I am flying with wings");
    }
}
