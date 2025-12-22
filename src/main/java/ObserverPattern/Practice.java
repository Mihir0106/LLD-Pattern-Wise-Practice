//package ObserverPattern;
//
//import ObserverPattern.Interfaces.IObserver;
//import ObserverPattern.Observers.LcdDisplay;
//import ObserverPattern.Observers.PhoneDisplay;
//
//public class Practice {
//    static void main() {
//        WeatherStation observable = new WeatherStation();
//        IObserver phone = new PhoneDisplay(observable);
//        IObserver lcd = new LcdDisplay(observable);
//        observable.add(phone);
//        observable.add(lcd);
//        observable.setTemperature();
//        observable.setTemperature();
//    }
//}
