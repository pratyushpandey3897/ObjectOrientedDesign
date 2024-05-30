package casestudies.AmazonOnline.accounts;

import casestudies.AmazonOnline.Product;
import casestudies.AmazonOnline.Review;

import java.util.List;

public class Account {
    private String userName;
    private String password;
    private String name;
    private List<String> shippingAddress;
    private String email;
    private String phone;

    public boolean addProduct (Product product) {
        return false;
    }

    public boolean addProductReview (Review review, Product product) {
        return false;
    }

    public boolean deleteProduct (Product product) {
        return false;
    }

    public boolean deleteProductReview (Review review, Product product) {
        return false;
    }

    public boolean resetPassword () {
        return false;
    }
}
