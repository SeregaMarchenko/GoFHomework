package main.java.observer.observers;

public class ObserverImpl implements Observer {
    private String name;

    public ObserverImpl(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " получил сообщение " + message);
    }
}
