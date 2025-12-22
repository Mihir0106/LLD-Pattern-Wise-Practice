package StrategyPattern;

import StrategyPattern.Interfaces.IDisplayStrategy;
import StrategyPattern.Interfaces.IFlyStrategy;
import StrategyPattern.Interfaces.IQuackStrategy;

public class Duck {
    IQuackStrategy quackStrategy;
    IFlyStrategy flyStrategy;
    IDisplayStrategy displayStrategy;

    public Duck(IQuackStrategy quackStrategy, IFlyStrategy flyStrategy, IDisplayStrategy displayStrategy){
        this.displayStrategy = displayStrategy;
        this.flyStrategy = flyStrategy;
        this.quackStrategy = quackStrategy;

        Fly();
        Quack();
        Display();
    }

    public void  Fly(){
        flyStrategy.fly();
    }
    public void Quack(){
        quackStrategy.quack();
    }

    public void Display(){
        displayStrategy.display();
    }
}
