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
    }

    @Override
    public void Update() {
        int latestPrice = marketDataFeed.getLatestPrice();
        if(latestPrice > prevPrice + (prevPrice* 0.02f)){
            tradingStrategy = new MomentumTradingStrategy();
        }
        else if(latestPrice > prevPrice + (prevPrice*0.05)){
            tradingStrategy = new ReversionTradingStrategy();
        }else{
            tradingStrategy = new DCATradingStrategy();
        }

        tradingStrategy.Analyze();
        prevPrice = latestPrice;
    }
}
