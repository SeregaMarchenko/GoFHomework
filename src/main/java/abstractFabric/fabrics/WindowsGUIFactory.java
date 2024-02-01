package main.java.abstractFabric.fabrics;

import main.java.abstractFabric.buttons.Button;
import main.java.abstractFabric.buttons.WindowsButton;
import main.java.abstractFabric.checkboxes.CheckBox;
import main.java.abstractFabric.checkboxes.WindowsCheckBox;

public class WindowsGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
