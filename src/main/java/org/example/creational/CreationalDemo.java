package org.example.creational;

import org.example.creational.abstractFactory.*;
import org.example.creational.builder.*;

public class CreationalDemo {
    private static ParentFactory parentFactory;
    public static void main(String[] args) {
        //builder pattern implementation from client code:

        ProductBuilder productBuilder = new ConcreteBuilder2();
        ProductDirector productDirector = new ProductDirector(productBuilder);

        productDirector.constructProduct();
        Product product = productDirector.getProduct();
        System.out.println("Built Product: " + product);
    }
}
