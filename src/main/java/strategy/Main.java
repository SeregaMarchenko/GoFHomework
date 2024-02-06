package main.java.strategy;

import main.java.strategy.context.ContextActions;
import main.java.strategy.strategies.AttackStrategy;
import main.java.strategy.strategies.DefendStrategy;
import main.java.strategy.strategies.RunStrategy;

public class Main {
    public static void main(String[] args) {
        ContextActions context = new ContextActions();
        context.setStrategy(new AttackStrategy());
        context.doAction();
        context.setStrategy(new DefendStrategy());
        context.doAction();
        context.setStrategy(new RunStrategy());
        context.doAction();
    }
}
