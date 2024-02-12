package casestudies.pen.pens;

import casestudies.pen.Refill;
import casestudies.pen.writestrategy.WriteStrategy;

public class BallPen extends Pen{
    private Refill refill;


    public BallPen (WriteStrategy writeStrategy) {
        super(writeStrategy);
    }

    public Refill getRefill () {
        return refill;
    }

    public void setRefill (Refill refill) {
        this.refill = refill;
    }

    @Override
    public void write () {
        this.getWriteStrategy ().writeBehaviour ();
    }
}
