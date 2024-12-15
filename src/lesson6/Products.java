package lesson6;

public class Products {

    public Product type;
    public int prc;
    public String name;
    public boolean exist;

    public Products (Product type, int uPrc, String uName, boolean uExist){
        this.type = type;
        prc = uPrc;
        name = uName;
        exist = uExist;
    }
}