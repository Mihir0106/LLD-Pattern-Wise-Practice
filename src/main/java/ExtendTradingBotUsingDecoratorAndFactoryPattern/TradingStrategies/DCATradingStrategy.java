package ExtendTradingBotUsingDecoratorAndFactoryPattern.TradingStrategies;

import ExtendTradingBotUsingDecoratorAndFactoryPattern.Interfaces.TradingStrategy;

public class DCATradingStrategy implements TradingStrategy {

    @Override
    public void Analyze(int prev, int latest) {
        System.out.println("use DCA Strategy for Trading");
    }
}
