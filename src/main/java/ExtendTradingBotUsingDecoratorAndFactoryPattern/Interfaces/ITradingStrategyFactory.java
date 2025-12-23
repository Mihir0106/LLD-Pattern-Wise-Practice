package ExtendTradingBotUsingDecoratorAndFactoryPattern.Interfaces;

import ExtendTradingBotUsingDecoratorAndFactoryPattern.Enums.Strategies;

public interface ITradingStrategyFactory {
    TradingStrategy getStrategy(Strategies strategy);
}
