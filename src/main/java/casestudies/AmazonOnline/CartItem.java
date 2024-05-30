package casestudies.AmazonOnline;

public class CartItem {
    Product product;
    int quantity;
    double price;

    //update quantity
    public void updateQuantity(int quantity) {
        this.quantity = quantity;
    }
}
