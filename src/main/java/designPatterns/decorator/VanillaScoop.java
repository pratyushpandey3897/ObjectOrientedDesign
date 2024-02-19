package designPatterns.decorator;

public class VanillaScoop implements IceCreamEntity {
    private IceCreamEntity iceCreamEntity;
    VanillaScoop (IceCreamEntity iceCreamEntity) {
        this.iceCreamEntity = iceCreamEntity;
    }
    @Override
    public String getDescription () {
        return this.iceCreamEntity.getDescription ()+" + Vanilla Scoop";
    }

    @Override
    public int getCost () {
        return this.iceCreamEntity.getCost () + 15;
    }
}
