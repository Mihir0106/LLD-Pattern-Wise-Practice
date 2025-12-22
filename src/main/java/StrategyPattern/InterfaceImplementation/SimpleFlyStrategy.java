package StrategyPattern.InterfaceImplementation;

import StrategyPattern.Interfaces.IFlyStrategy;

public class SimpleFlyStrategy implements IFlyStrategy {
    @Override
    public void fly() {
        System.out.println("SimpleFlyStrategy");
    }
}
