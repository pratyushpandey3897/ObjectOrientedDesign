package designPatterns.decorator;

public class Client {
    public static void main (String[] args) {
    IceCreamEntity iceCreamEntity = new ChocoChips (new VanillaScoop (new ChocolateCone ()));

    System.out.println (iceCreamEntity.getDescription ());
    System.out.println (iceCreamEntity.getCost ());
    }
}
