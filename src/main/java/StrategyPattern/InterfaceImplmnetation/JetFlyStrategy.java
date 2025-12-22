package StrategyPattern.InterfaceImplmnetation;

import StrategyPattern.Interfaces.IFlyStrategy;

public class JetFlyStrategy implements IFlyStrategy {
    @Override
    public void fly() {
        System.out.println("JetFlyStrategy");
    }
}
