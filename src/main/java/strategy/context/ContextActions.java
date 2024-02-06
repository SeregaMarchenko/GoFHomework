package main.java.strategy.context;

import main.java.strategy.strategies.Strategy;

public class ContextActions {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doAction() {
        strategy.action();
    }
}
