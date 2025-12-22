package StrategyPattern.InterfaceImplmnetation;

import StrategyPattern.Interfaces.IDisplayStrategy;

public class SimpleDisplayStrategy implements IDisplayStrategy {

    @Override
    public void display() {
        System.out.println("DisplayStrategy");
    }
}
