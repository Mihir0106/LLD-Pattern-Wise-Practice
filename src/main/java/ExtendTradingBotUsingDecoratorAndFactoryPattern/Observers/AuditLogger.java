package ExtendTradingBotUsingDecoratorAndFactoryPattern.Observers;

import ExtendTradingBotUsingDecoratorAndFactoryPattern.Interfaces.IObserver;
import ExtendTradingBotUsingDecoratorAndFactoryPattern.MarketDataFeed;

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
