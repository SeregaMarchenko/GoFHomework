package main.java.chainresponsibility;

public class ConcreteHandler3 extends AbstractHandler{
    @Override
    public void handlerRequest(String request) {
        if (request.equals("3")) {
            System.out.println("Handler 3 is handling request");
        } else {
            super.handlerRequest(request);
        }
    }
}
