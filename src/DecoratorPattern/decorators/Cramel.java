package DecoratorPattern.decorators;

import DecoratorPattern.components.Beverage;

public class Cramel extends CondimentDecorator{

    public Cramel(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return beverage.cost() + 7;
    }
}
