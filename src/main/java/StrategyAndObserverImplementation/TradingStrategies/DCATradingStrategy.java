package StrategyAndObserverImplementation.TradingStrategies;

import StrategyAndObserverImplementation.Interfaces.TradingStrategy;

public class DCATradingStrategy implements TradingStrategy {

    @Override
    public void Analyze() {
        System.out.println("use DCA Strategy for Trading");
    }
}
