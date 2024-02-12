package casestudies.pen.pens;

import casestudies.pen.Cap;
import casestudies.pen.writestrategy.WriteStrategy;

public abstract class Pen {
    private WriteStrategy writeStrategy;
    private String name;
    private Cap cap;
    private String brand;
    private double length;

    public Pen (WriteStrategy writeStrategy) {
        this.writeStrategy = writeStrategy;
    }


    public String getName () {
        return name;
    }

    public Cap getCap () {
        return cap;
    }

    public String getBrand () {
        return brand;
    }

    public double getLength () {
        return length;
    }

    public void setWriteStrategy (WriteStrategy writeStrategy) {
        this.writeStrategy = writeStrategy;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setCap (Cap cap) {
        this.cap = cap;
    }

    public void setBrand (String brand) {
        this.brand = brand;
    }

    public WriteStrategy getWriteStrategy () {
        return writeStrategy;
    }

    public void setLength (double length) {
        this.length = length;
    }

    public abstract void write ();

}
