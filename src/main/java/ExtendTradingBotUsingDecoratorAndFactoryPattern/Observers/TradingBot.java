package ExtendTradingBotUsingDecoratorAndFactoryPattern.Observers;

import ExtendTradingBotUsingDecoratorAndFactoryPattern.Interfaces.IObserver;
import ExtendTradingBotUsingDecoratorAndFactoryPattern.Interfaces.TradingStrategy;
import ExtendTradingBotUsingDecoratorAndFactoryPattern.MarketDataFeed;
import ExtendTradingBotUsingDecoratorAndFactoryPattern.TradingStrategies.MomentumTradingStrategy;

public class TradingBot implements IObserver {

    MarketDataFeed marketDataFeed;
    TradingStrategy tradingStrategy;
    int prevPrice;

    public TradingBot(MarketDataFeed marketDataFeed, TradingStrategy initialTradingStrategy){
        this.marketDataFeed = marketDataFeed;

        this.tradingStrategy = initialTradingStrategy;
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
