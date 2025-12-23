package ExtendTradingBotUsingDecoratorAndFactoryPattern.Observers;

import ExtendTradingBotUsingDecoratorAndFactoryPattern.Interfaces.IObserver;
import ExtendTradingBotUsingDecoratorAndFactoryPattern.MarketDataFeed;

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
