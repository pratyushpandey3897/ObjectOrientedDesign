package designPatterns.strategy;

public class PathCalculatorFactory {
    public static PathCalculatorStrategy getPathCalculator(String modeOfTransport) {
        if (modeOfTransport.equals("walk")) {
            return new WalkPathCalculatorStrategy ();
        } else if (modeOfTransport.equals("car")) {
            return new CarPathCalculatorStrategy ();
        } else if (modeOfTransport.equals("bike")) {
            return new BikePathCalculatorStrategy ();
        } else {
            return null;
        }
    }
}
