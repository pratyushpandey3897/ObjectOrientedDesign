package casestudies.pen.pens;

import casestudies.pen.Refill;
import casestudies.pen.writestrategy.WriteStrategy;

public class SketchPen extends Pen{
    private Refill refill;

    public SketchPen (WriteStrategy writeStrategy) {
        super (writeStrategy);
    }


    @Override
    public void write () {
        System.out.println("Writing with SketchPen");
    }
}
