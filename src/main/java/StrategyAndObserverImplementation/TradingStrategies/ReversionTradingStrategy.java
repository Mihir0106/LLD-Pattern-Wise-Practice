package StrategyAndObserverImplementation.TradingStrategies;

import StrategyAndObserverImplementation.Interfaces.TradingStrategy;

public class ReversionTradingStrategy implements TradingStrategy {
    @Override
    public void Analyze() {
        System.out.println("use Reversion Strategy for Trading");
    }
}
