package main.java.abstractFabric.checkboxes;

public class WindowsCheckBox implements CheckBox{
    @Override
    public void check() {
        System.out.println("Windows checkbox checked");
    }
}
