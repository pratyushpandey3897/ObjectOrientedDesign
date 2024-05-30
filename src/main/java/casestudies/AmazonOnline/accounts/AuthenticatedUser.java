package casestudies.AmazonOnline.accounts;

import casestudies.AmazonOnline.Cart;
import casestudies.AmazonOnline.Order.Order;

public class AuthenticatedUser extends Customer{
    private Cart cart;
    private Order order;
    private Account account;

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

}
