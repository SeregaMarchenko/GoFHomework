package main.java.chainresponsibility;

public abstract class AbstractHandler implements Handler {
    private Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    @Override
    public void handlerRequest(String request) {
        if (successor != null) {
            successor.handlerRequest(request);
        }
    }
}
