package casestudies.AmazonOnline.Order;

import casestudies.AmazonOnline.Cart;

import java.util.List;

public class Order {
    String orderNumber;
    OrderStatus status;
    Cart cart;
    private List<OrderLog> orderLog;

    //make payment function
    public void makePayment() {
    }

}
