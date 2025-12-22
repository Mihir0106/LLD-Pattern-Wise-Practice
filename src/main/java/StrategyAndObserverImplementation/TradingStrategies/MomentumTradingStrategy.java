package StrategyAndObserverImplementation.TradingStrategies;

import StrategyAndObserverImplementation.Interfaces.TradingStrategy;

public class MomentumTradingStrategy implements TradingStrategy {

    @Override
    public void Analyze(int prevPrice, int latestPrice) {

        if(latestPrice > prevPrice + prevPrice*0.02f)
            System.out.println("use Momentum Strategy for Trading : Signal BUY");
        else
            System.out.println("Momentum SStrategy No Significant Move");
    }
}
