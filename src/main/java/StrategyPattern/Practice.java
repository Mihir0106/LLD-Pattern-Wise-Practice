package StrategyPattern;

import StrategyPattern.InterfaceImplementation.JetFlyStrategy;
import StrategyPattern.InterfaceImplementation.SimpleDisplayStrategy;
import StrategyPattern.InterfaceImplementation.SimpleFlyStrategy;
import StrategyPattern.InterfaceImplementation.SimpleQuackStrategy;

public class Practice {
    static void main() {
        Duck wildDuck = new Duck(new SimpleQuackStrategy(), new SimpleFlyStrategy(), new SimpleDisplayStrategy());
        System.out.println("--------------------");
        Duck CloudDuck = new Duck(new SimpleQuackStrategy(),new JetFlyStrategy(), new SimpleDisplayStrategy());
    }
}
