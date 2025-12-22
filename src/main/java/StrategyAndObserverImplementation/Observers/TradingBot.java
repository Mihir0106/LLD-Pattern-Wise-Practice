package StrategyAndObserverImplementation.Observers;

import StrategyAndObserverImplementation.Interfaces.IObserver;
import StrategyAndObserverImplementation.Interfaces.TradingStrategy;
import StrategyAndObserverImplementation.MarketDataFeed;
import StrategyAndObserverImplementation.TradingStrategies.DCATradingStrategy;
import StrategyAndObserverImplementation.TradingStrategies.MomentumTradingStrategy;
import StrategyAndObserverImplementation.TradingStrategies.ReversionTradingStrategy;

public class TradingBot implements IObserver {

    MarketDataFeed marketDataFeed;
    TradingStrategy tradingStrategy;
    int prevPrice;

    public TradingBot(MarketDataFeed marketDataFeed){
        this.marketDataFeed = marketDataFeed;

        this.tradingStrategy = new MomentumTradingStrategy();
    }

    public void setTradingStrategy(TradingStrategy tradingStrategy) {
        this.tradingStrategy = tradingStrategy;
    }

    @Override
    public void Update() {
        int latestPrice = marketDataFeed.getLatestPrice();

        if(prevPrice != 0)
            tradingStrategy.Analyze(prevPrice,latestPrice);

        prevPrice = latestPrice;
    }
}
