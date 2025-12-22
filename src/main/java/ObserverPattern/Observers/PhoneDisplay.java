package ObserverPattern.Observers;

import ObserverPattern.Interfaces.IObservable;
import ObserverPattern.Interfaces.IObserver;
import ObserverPattern.Observers.BaseClass.Display;
import ObserverPattern.WeatherStation;

public class PhoneDisplay extends Display implements IObserver{
    WeatherStation weatherStation;

    public PhoneDisplay(WeatherStation observable) {
        super(observable);
        this.weatherStation = observable;
    }

    @Override
    public void update(){
        int temp = weatherStation.getTemperature();
        System.out.println("PhoneDisplay Notified Temperature: " + temp);
    }
}
