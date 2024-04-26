package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

import ObserverPattern.Interface.IObserver;
import ObserverPattern.Interface.IObserverable;

public class PodcastA implements IObserverable {

    List<IObserver> observerList = new ArrayList<>();
    String name = "podcaseA";

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
        for (IObserver observer : observerList) {
            observer.update();
        }
    }

    public String getName() {
        return this.name;
    }
}
