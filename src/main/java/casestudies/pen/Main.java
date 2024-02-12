package casestudies.pen;

import casestudies.pen.pens.BallPen;
import casestudies.pen.pens.Pen;
import casestudies.pen.writestrategy.SmoothWriteStrategy;

public class Main {
    public static void main (String[] args) {
        Pen reynolds = new BallPen (new SmoothWriteStrategy ());
        reynolds.write();
    }
}
