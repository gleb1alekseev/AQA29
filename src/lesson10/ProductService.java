package lesson10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductService {

    public boolean findByName(List<Product> products, String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    public List<Product> findProductsAbovePrice(List<Product> products, int price) {
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.getPrice() > price) {
                result.add(product);
            }
        }
        return result;
    }

    public int totalQuantity(List<Product> products) {
        int quantity = 0;
        for (Product product : products) {
            quantity += product.getQuantity();
        }
        return quantity;
    }
}
