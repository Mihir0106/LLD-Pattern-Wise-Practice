package ExtendTradingBotUsingDecoratorAndFactoryPattern.SafetyMechanism.Base;

import ExtendTradingBotUsingDecoratorAndFactoryPattern.Interfaces.TradingStrategy;

public abstract class BaseTradingStrategyDecorator implements TradingStrategy {
    public TradingStrategy tradingStrategy;
}
