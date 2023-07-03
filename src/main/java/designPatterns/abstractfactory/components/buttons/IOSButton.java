package designPatterns.abstractfactory.components.buttons;

public class IOSButton implements Button{
    @Override
    public void changeSize() {
        System.out.println ("change iOS button size");
    }
}
