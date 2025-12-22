package DecoratorPattern;

import DecoratorPattern.Base.Beverage;
import DecoratorPattern.BeverageTypes.Espresso;
import DecoratorPattern.Decorator.AddonDecorator;
import DecoratorPattern.Decorator.AddonTypes.Caramel;
import DecoratorPattern.Decorator.AddonTypes.Cream;

public class Practice {

    static void main(String[] args) {
        Beverage beverage = new Caramel (new Cream (new Espresso())); //new Espresso();
        System.out.println("cost : " + beverage.cost());

//        AddonDecorator addonDecorator = new Cream(beverage);
//        System.out.println("cost : " + addonDecorator.cost());
//
//        AddonDecorator addonDecorator1 = new Caramel(addonDecorator);
//        System.out.println("cost : " + addonDecorator1.cost());

    }
}
