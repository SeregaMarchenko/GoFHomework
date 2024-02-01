package main.java.abstractFabric;

import main.java.abstractFabric.buttons.Button;
import main.java.abstractFabric.checkboxes.CheckBox;
import main.java.abstractFabric.fabrics.GUIFactory;
import main.java.abstractFabric.fabrics.MacGUIFactory;
import main.java.abstractFabric.fabrics.WindowsGUIFactory;

public class Client {
    private GUIFactory guiFactory;

    public Client(GUIFactory guiFactory) {
        this.guiFactory = guiFactory;
    }

    public void createUI() {
        Button button = guiFactory.createButton();
        CheckBox checkBox = guiFactory.createCheckBox();
        button.click();
        checkBox.check();
    }

    public static void main(String[] args) {
        Client windowsClient = new Client(new WindowsGUIFactory());
        windowsClient.createUI();
        Client macClient = new Client(new MacGUIFactory());
        macClient.createUI();
    }
}
