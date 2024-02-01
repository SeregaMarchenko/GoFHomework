package main.java.proxy;

public class Proxy implements RealSubject {
    private RealSubjectImpl realSubject;

    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubjectImpl();
        }
        realSubject.request();
    }
}
