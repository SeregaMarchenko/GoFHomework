package main.java.chainresponsibility;

public class ConcreteHandler2 extends AbstractHandler{
    @Override
    public void handlerRequest(String request) {
        if (request.equals("2")) {
            System.out.println("Handler 2 is handling request");
        } else {
            super.handlerRequest(request);
        }
    }
}
