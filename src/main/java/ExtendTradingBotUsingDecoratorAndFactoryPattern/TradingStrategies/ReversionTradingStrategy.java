package ExtendTradingBotUsingDecoratorAndFactoryPattern.TradingStrategies;

import ExtendTradingBotUsingDecoratorAndFactoryPattern.Interfaces.TradingStrategy;

public class ReversionTradingStrategy implements TradingStrategy {
    @Override
    public void Analyze(int prevPrice, int latestPrice) {

        if(latestPrice < prevPrice - prevPrice*0.05f)
            System.out.println("use Reversion Strategy for Trading : Signal BUY");
        else
            System.out.println("Reversion Strategy No Significant Move");
    }
}
