package main.java.strategy.strategies;

public class RunStrategy implements Strategy {
    @Override
    public void action() {
        System.out.println("I'm running");
    }
}
