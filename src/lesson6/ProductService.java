package lesson6;

public class ProductService {

    public int pricesByProduct(Products [] list, Product type){
        int price = 0;
        for (Products products : list) {
            if (type == products.type) {
                price += products.price;
            }
        } return price;
    }

    public int countByType (Products [] list, Product type){
        int countType = 0;
        for (Products products : list) {
            if (type == products.type && products.exist) {
                countType++;
            }
        } return countType;
    }
}