package StrategyAndObserverImplementation.Observers;

import StrategyAndObserverImplementation.Interfaces.IObserver;
import StrategyAndObserverImplementation.MarketDataFeed;

public class DashBoard implements IObserver {
    MarketDataFeed marketDataFeed;

    public DashBoard(MarketDataFeed marketDataFeed){
        this.marketDataFeed = marketDataFeed;
    }

    @Override
    public void Update() {
        System.out.println("Update the Dashboard");
    }
}
