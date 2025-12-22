package DecoratorPattern.BeverageTypes;

import DecoratorPattern.Base.Beverage;

public class Espresso extends Beverage {
    @Override
    public int cost() {
        return 1;
    }
}
