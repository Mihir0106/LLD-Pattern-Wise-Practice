package StrategyPattern.DuckTypes;

import StrategyPattern.Duck;
import StrategyPattern.InterfaceImplementation.JetFlyStrategy;
import StrategyPattern.Interfaces.IDisplayStrategy;
import StrategyPattern.Interfaces.IFlyStrategy;
import StrategyPattern.Interfaces.IQuackStrategy;

public class CloudDuck extends Duck {


    public CloudDuck(IQuackStrategy quackStrategy, IFlyStrategy flyStrategy, IDisplayStrategy displayStrategy) {
        super(quackStrategy, flyStrategy, displayStrategy);

        flyStrategy = new JetFlyStrategy();
    }
}
