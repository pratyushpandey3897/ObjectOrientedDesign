package designPatterns.abstractfactory;

import designPatterns.abstractfactory.components.buttons.AndroidButton;
import designPatterns.abstractfactory.components.dropdown.AndroidDropdown;
import designPatterns.abstractfactory.components.menu.AndroidMenu;
import designPatterns.abstractfactory.components.menu.Menu;

public class AndroidUIFactory implements UIFactory{

    @Override
    public AndroidButton createButton() {
        return new AndroidButton ();
    }

    @Override
    public AndroidDropdown createDropdown() {
        return new AndroidDropdown ();
    }

    @Override
    public AndroidMenu createMenu() {
        return new AndroidMenu ();
    }
}
