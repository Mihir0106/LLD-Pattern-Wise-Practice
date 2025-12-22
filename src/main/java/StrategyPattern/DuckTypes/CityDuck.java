package StrategyPattern.DuckTypes;

import StrategyPattern.Duck;
import StrategyPattern.Interfaces.IDisplayStrategy;
import StrategyPattern.Interfaces.IFlyStrategy;
import StrategyPattern.Interfaces.IQuackStrategy;

public class CityDuck  extends Duck {
    public CityDuck(IQuackStrategy quackStrategy, IFlyStrategy flyStrategy, IDisplayStrategy displayStrategy) {
        super(quackStrategy, flyStrategy, displayStrategy);
    }
}
