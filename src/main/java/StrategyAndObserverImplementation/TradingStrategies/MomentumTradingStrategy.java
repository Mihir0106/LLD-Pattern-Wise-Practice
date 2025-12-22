package StrategyAndObserverImplementation.TradingStrategies;

import StrategyAndObserverImplementation.Interfaces.TradingStrategy;

public class MomentumTradingStrategy implements TradingStrategy {

    @Override
    public void Analyze() {
        System.out.println("use Momentum Strategy for Trading");
    }
}
