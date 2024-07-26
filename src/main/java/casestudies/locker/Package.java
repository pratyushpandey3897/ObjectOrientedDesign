package casestudies.locker;

public class Package {
    Size size;
    Order order;

    public Package (Order order, Size size) {
        this.order = order;
        this.size = size;
    }

    void pack() {
        // pack the order into the package
    }
}
