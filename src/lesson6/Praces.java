package lesson6;

import java.util.Arrays;

public class Praces {

    public void PracesByProduct(Products [] list, Product type){

        for (Products products : list) {
            if (type == products.type)
            System.out.println("Prices " + products.type + " is " + products.price);
        }
    }
}