package main.java.abstractFabric.fabrics;

import main.java.abstractFabric.buttons.Button;
import main.java.abstractFabric.buttons.MacButton;
import main.java.abstractFabric.checkboxes.CheckBox;
import main.java.abstractFabric.checkboxes.MacCheckBox;

public class MacGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
