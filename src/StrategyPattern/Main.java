package StrategyPattern;

import StrategyPattern.behaviour.fly.FlyNoWay;
import StrategyPattern.behaviour.fly.FlyWithSuperPower;
import StrategyPattern.behaviour.fly.FlyWithWings;
import StrategyPattern.behaviour.quack.Quack;
import StrategyPattern.behaviour.quack.Queak;

public class Main {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck(new FlyWithWings(), new Quack());
        mallardDuck.eat();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        //mallarduck was shot by someone, So it cannot fly now
        mallardDuck.updateFlyBehaviour(new FlyNoWay());
        mallardDuck.performFly();

        RubberDuck rubberDuck = new RubberDuck(new FlyNoWay(), new Quack());
        rubberDuck.display();
        rubberDuck.eat();
        rubberDuck.performFly();
        rubberDuck.performQuack();

        DecoyDuck decoyDuck = new DecoyDuck(new FlyNoWay(), new Queak());
        decoyDuck.performFly();
        decoyDuck.performQuack();
        decoyDuck.updateFlyBehaviour(new FlyWithSuperPower());
        decoyDuck.performFly();
    }
}
