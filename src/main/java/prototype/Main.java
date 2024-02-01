package main.java.prototype;

public class Main {
    public static void main(String[] args) {
        ConcretePrototype original = new ConcretePrototype("Initial Property");
        ConcretePrototype clone = (ConcretePrototype) original.clone();
        clone.setProperty("Modified Property");
        original.printProperty();
        clone.printProperty();
    }
}
