package DecoratorPattern.Decorator;

import DecoratorPattern.Base.Beverage;

public abstract class AddonDecorator extends Beverage {
    protected Beverage beverage;
}
