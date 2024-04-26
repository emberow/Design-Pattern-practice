package ObserverPattern.Interface;

public interface IObserverable {
    public void add(IObserver observer);
    public void remove(IObserver observer);
    public void notifyObservers();
}
