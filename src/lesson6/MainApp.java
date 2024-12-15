package lesson6;

public class MainApp {

    public static void main(String[] args) {

        Products [] list = {
            new Products(Product.MOBILE, 1000, "phone", false),
            new Products(Product.TV, 1500, "television", false),
            new Products(Product.AUDIO, 500, "system", true),
        };

        Praces prc = new Praces();
        prc.PracesByProduct(list, Product.TV);

        Exist exist1 = new Exist();
        exist1.ExistByProduct(list, String.valueOf(Product.TV));

    }
}