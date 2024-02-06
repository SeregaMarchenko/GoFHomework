package main.java.chainresponsibility;

public class ConcreteHandler1 extends AbstractHandler {
    @Override
    public void handlerRequest(String request) {
        if (request.equals("1")) {
            System.out.println("Handler 1 is handling request");
        } else {
            super.handlerRequest(request);
        }
    }
}
