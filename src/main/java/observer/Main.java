package main.java.observer;

import main.java.observer.observers.Observer;
import main.java.observer.observers.ObserverImpl;
import main.java.observer.subjects.SubjectImpl;

public class Main {
    public static void main(String[] args) {
        SubjectImpl subject = new SubjectImpl();
        Observer observer_1 = new ObserverImpl("Kate");
        Observer observer_2 = new ObserverImpl("Tom");
        Observer observer_3 = new ObserverImpl("Bill");
        subject.addObserver(observer_1);
        subject.addObserver(observer_2);
        subject.addObserver(observer_3);
        subject.notifyObservers("Hello observer!!!");
    }
}
