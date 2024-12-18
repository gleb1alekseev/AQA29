package lesson6;

public class Products {

    public Product type;
    public int price;
    public String name;
    public boolean exist;

    public Products (Product type, int price, String name, boolean exist){
        this.type = type;
        this.price = price;
        this.name = name;
        this.exist = exist;
    }
}