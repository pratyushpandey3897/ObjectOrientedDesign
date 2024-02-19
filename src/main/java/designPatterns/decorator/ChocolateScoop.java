package designPatterns.decorator;

public class ChocolateScoop implements IceCreamEntity{
    private IceCreamEntity iceCreamEntity;

    ChocolateScoop(IceCreamEntity iceCreamEntity) {
        this.iceCreamEntity = iceCreamEntity;
    }
    @Override
    public int getCost () {
        return this.iceCreamEntity.getCost () + 10;
    }

    @Override
    public String getDescription () {
        return this.iceCreamEntity.getDescription ()+" + Chocolate Scoop";
    }
}
