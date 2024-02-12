package casestudies.pen.pens;

import casestudies.pen.Refill;
import casestudies.pen.writestrategy.WriteStrategy;

public class GelPen extends Pen{
    private Refill refill;

    public GelPen (WriteStrategy writeStrategy) {
        super (writeStrategy);
    }

    public Refill getRefill () {
        return refill;
    }

    public void setRefill (Refill refill) {
        this.refill = refill;
    }

    @Override
    public void write () {
        System.out.println("Writing with GelPen");
    }
}
