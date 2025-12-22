package StrategyPattern.InterfaceImplmnetation;

import StrategyPattern.Interfaces.IQuackStrategy;

public class SimpleQuackStrategy implements IQuackStrategy {

    @Override
    public void quack() {
        System.out.println("SimpleQuackStrategy");
    }
}
