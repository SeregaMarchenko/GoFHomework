package main.java.abstractFabric.fabrics;

import main.java.abstractFabric.buttons.Button;
import main.java.abstractFabric.checkboxes.CheckBox;

public interface GUIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
