package designPatterns.strategy;

public class WalkPathCalculatorStrategy implements PathCalculatorStrategy {
    @Override
    public void findPath(String source, String destination) {
        System.out.println("Finding path from " + source + " to " + destination + " by walking");
    }
}
