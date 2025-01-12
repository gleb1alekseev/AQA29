package lesson10;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {

        List<Product> product = new ArrayList<>();

        product.add(new Product("apple", 10, 15));
        product.add(new Product("lemon", 11, 20));
        product.add(new Product("banana", 12, 25));

        String searchName = "apple";
        var productService = new ProductService();
        var result = productService.findByName(product,searchName);
        System.out.println(result);

        int price = 10;
        List<Product> expensiveProducts = productService.findProductsAbovePrice(product, price);
        System.out.println("Товары с ценой выше " + price + " : "  + expensiveProducts);

        int totalQuantity = productService.totalQuantity(product);
        System.out.println("Общее количество товаров: " + totalQuantity);

        Product product4 = new Product ("orange", 13, 30);

        product.add(2, new Product("orange", 13, 30));

        System.out.println("Количество элементов в списке: " + product.size());

        System.out.println("Имеется последний добавленный продукт: " + product.contains(product4));

        System.out.println("Все товары из списка до последнего добавленного: " + product.subList(0, 3));

        System.out.println("Товары в обратной последовательности: " + product.reversed());

    }
}