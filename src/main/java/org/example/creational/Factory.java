package org.example.creational;

public class Factory {

    public static ProductInterface createProduct(String productName) {
        if(productName == null || productName.isEmpty())
            return null;
        switch(productName.toLowerCase()) {
            case "concreteproductone": return new ConcreteProductOne();
            case "concreteproducttwo": return new ConcreteProductTwo();
            case "concreteproductthree": return new ConcreteProductThree();
            default: throw new IllegalArgumentException("Invalid product name: " + productName);
        }
    }
}
