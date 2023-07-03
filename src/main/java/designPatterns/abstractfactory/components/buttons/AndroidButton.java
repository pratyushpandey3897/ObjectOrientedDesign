package designPatterns.abstractfactory.components.buttons;

public class AndroidButton implements Button{
    @Override
    public void changeSize() {
        System.out.println ("change android button size");
    }
}
