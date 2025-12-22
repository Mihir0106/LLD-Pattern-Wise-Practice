package StrategyAndObserverImplementation.Observers;

import StrategyAndObserverImplementation.Interfaces.IObservable;
import StrategyAndObserverImplementation.Interfaces.IObserver;
import StrategyAndObserverImplementation.MarketDataFeed;

public class AuditLogger implements IObserver {
    MarketDataFeed marketDataFeed;

    public  AuditLogger(MarketDataFeed marketDataFeed){
        this.marketDataFeed = marketDataFeed;
    }

    @Override
    public void Update() {
        System.out.println("Update in Logs");
    }
}
