package ExtendTradingBotUsingDecoratorAndFactoryPattern.Factory;

import ExtendTradingBotUsingDecoratorAndFactoryPattern.Enums.Strategies;
import ExtendTradingBotUsingDecoratorAndFactoryPattern.Interfaces.ITradingStrategyFactory;
import ExtendTradingBotUsingDecoratorAndFactoryPattern.Interfaces.TradingStrategy;
import ExtendTradingBotUsingDecoratorAndFactoryPattern.SafetyMechanism.StopLossDecorator;
import ExtendTradingBotUsingDecoratorAndFactoryPattern.TradingStrategies.MomentumTradingStrategy;
import ExtendTradingBotUsingDecoratorAndFactoryPattern.TradingStrategies.ReversionTradingStrategy;

public class TradingStrategyFactory implements ITradingStrategyFactory {
    @Override
    public TradingStrategy getStrategy(Strategies strategy) {

        return switch (strategy){
            case Momentum -> new MomentumTradingStrategy();
            case Reversion -> new ReversionTradingStrategy();
            case SafeMomentum -> new StopLossDecorator(new MomentumTradingStrategy());
            case SafeReversion -> new StopLossDecorator(new ReversionTradingStrategy());
            default-> throw new IllegalArgumentException();
        };
    }
}
