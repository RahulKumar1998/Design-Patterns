package org.example.creational;

public class Singleton {
    //lazy initialization
    //instance created only when required
    private static Singleton instance;
    private Singleton(){

    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    //better than early initialization
    //still not thread-safe
}
