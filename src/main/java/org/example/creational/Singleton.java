package org.example.creational;

public class Singleton {
    //Thread-safe singleton
    //instance created only when required
    private static Singleton instance;

    private Singleton() {
    }

    //synchronized getInstance() using double-check locking
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    //Lock is acquired on class object as monitor object(Singleton.class)
    //double-checked locking is used, if instance is null, locks are not acquired by the threads.
    //this slightly reduces the overhead due to synchronization
}
