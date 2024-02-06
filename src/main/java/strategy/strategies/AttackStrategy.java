package main.java.strategy.strategies;

public class AttackStrategy implements Strategy {
    @Override
    public void action() {
        System.out.println("I'm attacking");
    }
}
