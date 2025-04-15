package DecoratorPattern.decorators;

import DecoratorPattern.components.Beverage;

public class Soy extends CondimentDecorator{

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return beverage.cost() + 5;
    }
}
