package org.example.creational;

public class Singleton {
    //Thread-safe singleton
    //instance created only when required
    private static Singleton instance;
    private Singleton() {
    }

    //synchronized method ensure thread-safety
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    //synchronized method although thread-safe takes up lots of overhead and can reduce the speed of a large program/application
}
