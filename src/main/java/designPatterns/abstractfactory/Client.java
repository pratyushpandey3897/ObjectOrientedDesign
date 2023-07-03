package designPatterns.abstractfactory;

import designPatterns.abstractfactory.components.buttons.Button;
import designPatterns.abstractfactory.components.menu.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter ();
        UIFactory uiFactory = flutter.createUIFactory (SupportedPlatforms.IOS);
        Button button = uiFactory.createButton ();

        button.changeSize ();
 }
}
