package main.java.proxy;

public class RealSubjectImpl implements RealSubject{
    @Override
    public void request() {
        System.out.println("Выполнение запроса от реального объекта.");
    }
}
