package ObserverPattern.Observers.BaseClass;

import ObserverPattern.Interfaces.IObservable;
import ObserverPattern.Interfaces.IObserver;

public abstract class Display {
    public IObservable observable;

    public Display(IObservable observable){
        this.observable = observable;
    }
}
