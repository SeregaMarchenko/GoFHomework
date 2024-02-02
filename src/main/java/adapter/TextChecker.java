package main.java.adapter;

public class TextChecker implements IChecker{
    @Override
    public void check() {
        System.out.println("I check some text...");
    }
}
