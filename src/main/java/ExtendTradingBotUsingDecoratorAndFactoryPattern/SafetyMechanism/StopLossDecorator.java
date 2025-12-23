package ExtendTradingBotUsingDecoratorAndFactoryPattern.SafetyMechanism;

import ExtendTradingBotUsingDecoratorAndFactoryPattern.Interfaces.TradingStrategy;
import ExtendTradingBotUsingDecoratorAndFactoryPattern.SafetyMechanism.Base.BaseTradingStrategyDecorator;

public class StopLossDecorator extends BaseTradingStrategyDecorator {

    public StopLossDecorator(TradingStrategy tradingStrategy){
        this.tradingStrategy = tradingStrategy;
    }

    @Override
    public void Analyze(int prev, int latest) {
        if(latest < prev - prev*0.1f){
            System.out.println("Block the Trading");
        }else{
            tradingStrategy.Analyze(prev,latest);
        }
    }
}
