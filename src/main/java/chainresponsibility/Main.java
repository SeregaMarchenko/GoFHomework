package main.java.chainresponsibility;

public class Main {
    public static void main(String[] args) {
        AbstractHandler handler1 = new ConcreteHandler1();
        AbstractHandler handler2 = new ConcreteHandler2();
        AbstractHandler handler3 = new ConcreteHandler3();
        handler1.setSuccessor(handler2);
        handler2.setSuccessor(handler3);
        handler1.handlerRequest("2");
        handler1.handlerRequest("3");
        handler1.handlerRequest("1");
    }
}
