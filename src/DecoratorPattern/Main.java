package DecoratorPattern;

import DecoratorPattern.components.Beverage;
import DecoratorPattern.components.Decaf;
import DecoratorPattern.decorators.Cramel;
import DecoratorPattern.decorators.Soy;

public class Main {

    public static void main(String[] args) {

        Beverage beverage = new Decaf();
        int price= beverage.cost();
        System.out.println("Decaf Price " + price);

        Beverage beverage1 = new Decaf();
        beverage1 = new Cramel(beverage1);
        beverage1 = new Soy(beverage1);

        price = beverage1.cost();
        System.out.println("Decaf with Caramel and Soy Price " + price);

        Beverage beverage2 = new Decaf();
        beverage2 = new Cramel(beverage2);
        beverage2 = new Cramel(beverage2);
        beverage2 = new Soy(beverage2);

        price = beverage2.cost();
        System.out.println("Decaf with 2 shot Caramel and Soy Price " + price);
    }
}
