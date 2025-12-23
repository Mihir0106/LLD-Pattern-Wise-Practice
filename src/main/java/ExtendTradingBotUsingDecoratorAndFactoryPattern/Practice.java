package ExtendTradingBotUsingDecoratorAndFactoryPattern;


import ExtendTradingBotUsingDecoratorAndFactoryPattern.Enums.Strategies;
import ExtendTradingBotUsingDecoratorAndFactoryPattern.Factory.TradingStrategyFactory;
import ExtendTradingBotUsingDecoratorAndFactoryPattern.Observers.AuditLogger;
import ExtendTradingBotUsingDecoratorAndFactoryPattern.Observers.DashBoard;
import ExtendTradingBotUsingDecoratorAndFactoryPattern.Observers.TradingBot;
import ExtendTradingBotUsingDecoratorAndFactoryPattern.TradingStrategies.MomentumTradingStrategy;

public class Practice {

    public static void main(String[] args) {
        // 1. Create the Subject (Market Data)
        MarketDataFeed marketFeed = new MarketDataFeed();

        // 2. Create Observers
        DashBoard dashboard = new DashBoard(marketFeed);
        AuditLogger logger = new AuditLogger(marketFeed);
        TradingBot bot = new TradingBot(marketFeed, new MomentumTradingStrategy()); // Starts with Momentum Strategy
        TradingStrategyFactory tradingStrategyFactory = new TradingStrategyFactory();

        // 3. Register Observers
        marketFeed.add(dashboard);
        marketFeed.add(logger);
        marketFeed.add(bot);

        System.out.println("--- Market Opens: Price 100 ---");
        marketFeed.updateLatestPrice(100);
        // Bot records prevPrice = 100, no action yet

        System.out.println("\n--- Price Jump to 103 (Momentum Trigger) ---");
        // 103 is > 100 + 2% (102). Momentum should BUY.
        marketFeed.updateLatestPrice(103);

        System.out.println("\n--- User Switches Strategy to Reversion ---");
        bot.setTradingStrategy(tradingStrategyFactory.getStrategy(Strategies.SafeReversion) );

        System.out.println("\n--- Price Drop to 95 (Reversion Trigger) ---");
        // 95 is a significant drop from 103. Reversion should BUY (if logic is fixed).
        marketFeed.updateLatestPrice(95);

        System.out.println("\n--- Price Drop to 45 (Reversion Trigger) ---");
        // 95 is a significant drop from 103. Reversion should BUY (if logic is fixed).
        marketFeed.updateLatestPrice(45);
    }
}

