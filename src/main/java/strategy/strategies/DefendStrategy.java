package main.java.strategy.strategies;

public class DefendStrategy implements Strategy {
    @Override
    public void action() {
        System.out.println("I'm defending");
    }
}
