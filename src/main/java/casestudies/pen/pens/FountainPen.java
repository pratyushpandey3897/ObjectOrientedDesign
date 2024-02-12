package casestudies.pen.pens;

import casestudies.pen.Ink;
import casestudies.pen.Nib;
import casestudies.pen.writestrategy.WriteStrategy;

public class FountainPen extends Pen{

    private Ink ink;
    private Nib nib;

    public FountainPen (WriteStrategy writeStrategy) {
        super (writeStrategy);
    }

    @Override
    public void write () {
    }
}
