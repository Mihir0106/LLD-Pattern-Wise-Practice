package DecoratorPattern.Decorator.AddonTypes;

import DecoratorPattern.Base.Beverage;
import DecoratorPattern.Decorator.AddonDecorator;

public class Cream extends AddonDecorator {

    public Cream(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return 1 + beverage.cost();
    }
}
