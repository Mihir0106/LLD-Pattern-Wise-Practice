package StrategyAndObserverImplementation;

import StrategyAndObserverImplementation.Observers.AuditLogger;
import StrategyAndObserverImplementation.Observers.DashBoard;
import StrategyAndObserverImplementation.Observers.TradingBot;

public class Practice {

    static void main() {
        MarketDataFeed marketDataFeed = new MarketDataFeed();

        AuditLogger auditLogger = new AuditLogger(marketDataFeed);
        marketDataFeed.add(auditLogger);

        DashBoard dashBoard = new DashBoard(marketDataFeed);
        marketDataFeed.add(dashBoard);

        TradingBot tradingBot = new TradingBot(marketDataFeed);
        marketDataFeed.add(tradingBot);

        int num = 10;
        marketDataFeed.updateLatestPrice((int) (num + (num*0.3f)));
        System.out.println("-----------------");
        marketDataFeed.updateLatestPrice((int) (num + (num*0.5f)));
        System.out.println("-----------------");
        marketDataFeed.updateLatestPrice((int) (num));
        System.out.println("-----------------");
    }
}


/*
BroadCast to User DashBoard, Audit Logger and Analytics Engine
Execute Trades


Market Data Feed prices


 */