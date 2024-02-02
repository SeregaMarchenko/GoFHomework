package main.java.adapter;

public class Main {
    public static void main(String[] args) {
        IChecker checker = new TextChecker();
        checker.check();
        checker = new Adapter();
        checker.check();
    }
}
