package designPatterns.decorator;

public class ChocolateCone implements IceCreamEntity{
    @Override
    public int getCost () {
        return 30;
    }

    @Override
    public String getDescription () {
        return "Chocolate Cone";
    }
}
