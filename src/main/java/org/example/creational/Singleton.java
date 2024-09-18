package org.example.creational;

public class Singleton {
    //eager initialization
    //instance created on class loading, and will be created even if not required.
    private static final Singleton singleton = new Singleton();

    private Singleton() {

    }
    public static Singleton getInstance() {
        return singleton;
    }
}
