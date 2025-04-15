package DecoratorPattern.decorators;

import DecoratorPattern.components.Beverage;

public abstract class CondimentDecorator extends Beverage {

    Beverage beverage; //composition Has-a relationship
    public abstract int cost();
}
