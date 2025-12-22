package ObserverPattern;

import ObserverPattern.Interfaces.IObservable;
import ObserverPattern.Interfaces.IObserver;

import java.util.LinkedList;
import java.util.List;

public class WeatherStation implements IObservable {
    List<IObserver> observerList;

    WeatherStation(){
        observerList = new LinkedList<>();
    }

    @Override
    public void add(IObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(IObserver observer : observerList){
            observer.update();
        }
    }

    int temp = 0;

    public void setTemperature(){
        temp += 10;
        notifyObservers();
    }

    public int getTemperature(){
        return temp;
    }
}
