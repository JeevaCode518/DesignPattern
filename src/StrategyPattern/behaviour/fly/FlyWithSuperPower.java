package StrategyPattern.behaviour.fly;

import StrategyPattern.Flyable;

public class FlyWithSuperPower implements Flyable {
    @Override
    public void fly() {
        System.out.println("Ohhh.. Yeshhh... I am flying like rocket");
    }
}
