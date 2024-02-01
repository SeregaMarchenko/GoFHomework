package main.java.abstractFabric.buttons;

public class WindowsButton implements Button{
    @Override
    public void click() {
        System.out.println("Windows button clicked");
    }
}
