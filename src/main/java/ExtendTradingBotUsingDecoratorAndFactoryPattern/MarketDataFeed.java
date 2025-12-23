package ExtendTradingBotUsingDecoratorAndFactoryPattern;

import ExtendTradingBotUsingDecoratorAndFactoryPattern.Interfaces.IObservable;
import ExtendTradingBotUsingDecoratorAndFactoryPattern.Interfaces.IObserver;

import java.util.LinkedList;
import java.util.List;

public class MarketDataFeed implements IObservable {
    List<IObserver> observers;
    int latestPrice;

    public MarketDataFeed() {
        observers = new LinkedList<>();
    }

    @Override
    public void add(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (IObserver observer : observers) {
            observer.Update();
        }
    }

    public int getLatestPrice() {
        return latestPrice;
    }

    public void updateLatestPrice(int price) {
        latestPrice = price;
        notifyObserver();
    }
}
