package ObserverPattern.Observers;

import ObserverPattern.Interfaces.IObserver;
import ObserverPattern.Observers.BaseClass.Display;
import ObserverPattern.WeatherStation;

public class LcdDisplay extends Display implements IObserver {
    WeatherStation weatherStation;

    public LcdDisplay(WeatherStation weatherStation) {
        super(weatherStation);
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        int temp = 0;
        temp = weatherStation.getTemperature();
        System.out.println("LcdDisplay Notified Temperature : " + temp);
    }
}
