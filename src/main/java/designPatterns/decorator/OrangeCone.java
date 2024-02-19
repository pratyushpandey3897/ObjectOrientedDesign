package designPatterns.decorator;

public class OrangeCone implements IceCreamEntity{
    @Override
    public int getCost () {
        return 20;
    }

    @Override
    public String getDescription () {
        return "Orange Cone";
    }
}
