package org.example.creational;

public class CreationalDemo {
    public static void main(String[] args) {
//        Singleton singleton = Singleton.getInstance();
//        Singleton singleton2 = Singleton.getInstance();
//        System.out.println(singleton);
//        System.out.println(singleton2);

//            Prototype prototype = new Prototype(24, "rahul");
//            Prototype prototype2 = prototype.cloneIt();
//            System.out.println(prototype);
//            System.out.println(prototype2);

        ProductInterface product1 = Factory.createProduct("ConcreteProductOne");
        product1.method();

        ProductInterface product2 = Factory.createProduct("ConcreteProductTwo");
        product2.method();

        ProductInterface product3 = Factory.createProduct("ConcreteProductThree");
        product3.method();


    }
}
