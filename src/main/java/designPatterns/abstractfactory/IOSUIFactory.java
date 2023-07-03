package designPatterns.abstractfactory;

import designPatterns.abstractfactory.components.buttons.Button;
import designPatterns.abstractfactory.components.buttons.IOSButton;
import designPatterns.abstractfactory.components.dropdown.Dropdown;
import designPatterns.abstractfactory.components.dropdown.IOSDropdown;
import designPatterns.abstractfactory.components.menu.IOSMenu;
import designPatterns.abstractfactory.components.menu.Menu;

public class IOSUIFactory implements UIFactory{
    @Override
    public Dropdown createDropdown() {
        return new IOSDropdown ();
    }

    @Override
    public Button createButton() {
        return new IOSButton ();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu ();
    }
}
