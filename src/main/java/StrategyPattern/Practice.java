package StrategyPattern;

import StrategyPattern.InterfaceImplmnetation.JetFlyStrategy;
import StrategyPattern.InterfaceImplmnetation.SimpleDisplayStrategy;
import StrategyPattern.InterfaceImplmnetation.SimpleFlyStrategy;
import StrategyPattern.InterfaceImplmnetation.SimpleQuackStrategy;

public class Practice {
    static void main() {
        Duck wildDuck = new Duck(new SimpleQuackStrategy(), new SimpleFlyStrategy(), new SimpleDisplayStrategy());
        System.out.println("--------------------");
        Duck CloudDuck = new Duck(new SimpleQuackStrategy(),new JetFlyStrategy(), new SimpleDisplayStrategy());

    }
}
