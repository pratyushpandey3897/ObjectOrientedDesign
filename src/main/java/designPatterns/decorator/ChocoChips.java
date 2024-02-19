package designPatterns.decorator;

public class ChocoChips implements IceCreamEntity{
    private IceCreamEntity iceCreamEntity;
    ChocoChips(IceCreamEntity iceCreamEntity) {
        this.iceCreamEntity = iceCreamEntity;
    }

    @Override
    public int getCost () {
        return this.iceCreamEntity.getCost () + 5;
    }

    @Override
    public String getDescription () {
        return this.iceCreamEntity.getDescription ()+" + ChocoChips";
    }
}
