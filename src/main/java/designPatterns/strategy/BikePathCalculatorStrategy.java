package designPatterns.strategy;

public class BikePathCalculatorStrategy implements PathCalculatorStrategy {
    @Override
    public void findPath(String source, String destination) {
        System.out.println("Finding path from " + source + " to " + destination + " by bike");
    }
}
