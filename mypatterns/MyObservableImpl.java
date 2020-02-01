package fr.cnam.tp12.mypatterns;

import java.util.Vector;

public class MyObservableImpl implements MyObservable {

    private Vector<MyObserver> observers;

    public MyObservableImpl() {
        this.observers = new Vector<>();
    }

    @Override
    public void addObserver(MyObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void deleteObserver(MyObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public int countObservers() {
        return this.observers.size();
    }

    @Override
    public void notifyObservers() {

        for (MyObserver observer : this.observers) {
            observer.update();
        }
    }

}
