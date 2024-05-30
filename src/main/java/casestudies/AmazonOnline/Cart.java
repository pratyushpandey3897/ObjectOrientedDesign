package casestudies.AmazonOnline;

import java.util.List;

public class Cart {
    int totalPrice;
    List<CartItem> cartItems;


    public void addProduct(Product product, int quantity) {
        CartItem cartItem = new CartItem();
        cartItem.product = product;
        cartItem.quantity = quantity;
        cartItem.price = product.price * quantity;
        cartItems.add(cartItem);
        totalPrice += cartItem.price;
    }
    public void removeProduct(Product product) {
        for (CartItem cartItem : cartItems) {
            if (cartItem.product == product) {
                totalPrice -= cartItem.price;
                cartItems.remove(cartItem);
                break;
            }
        }
    }
    public void updateQuantity(Product product, int quantity) {
        for (CartItem cartItem : cartItems) {
            if (cartItem.product == product) {
                totalPrice -= cartItem.price;
                cartItem.quantity = quantity;
                cartItem.price = product.price * quantity;
                totalPrice += cartItem.price;
                break;
            }
        }
    }
}
