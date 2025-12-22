package DecoratorPattern.Decorator.AddonTypes;

import DecoratorPattern.Base.Beverage;
import DecoratorPattern.Decorator.AddonDecorator;

public class Caramel extends AddonDecorator {

    public Caramel(Beverage beverage){
        this.beverage = beverage;
    }


    @Override
    public int cost() {
        return 2 + beverage.cost();
    }
}
