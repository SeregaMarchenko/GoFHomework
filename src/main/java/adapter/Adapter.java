package main.java.adapter;

public class Adapter extends MessageReader implements IChecker{
    @Override
    public void check() {
        checkMessage();
    }
}
