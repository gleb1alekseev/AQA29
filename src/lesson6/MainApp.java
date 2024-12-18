package lesson6;

public class MainApp {

    public static void main(String[] args) {

        Products [] list = {
            new Products(Product.MOBILE, 1000, "iPhone 13", false),
            new Products(Product.TV, 1500, "LG", false),
            new Products(Product.AUDIO, 500, "boombox", false),
            new Products(Product.MOBILE, 1000, "Samsung", true),

        };

        ProductService productService = new ProductService();
        int count;
        int price;
        Product type = Product.MOBILE;

        count = productService.countByType (list, type);
        System.out.println("Count by type " + type + ": " + count);


        price = productService.pricesByProduct(list, type);
        System.out.println("Price by type " + type + ": " + price);
    }
}