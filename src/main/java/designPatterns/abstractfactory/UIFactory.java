package designPatterns.abstractfactory;

import designPatterns.abstractfactory.components.buttons.Button;
import designPatterns.abstractfactory.components.dropdown.Dropdown;
import designPatterns.abstractfactory.components.menu.Menu;

public interface UIFactory {
    Button createButton();
    Menu createMenu();
    Dropdown createDropdown();

}
