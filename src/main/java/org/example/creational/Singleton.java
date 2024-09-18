package org.example.creational;

public class Singleton {

    //bill pugh singleton
    //creation of singleton using static inner class, instance only created when inner class is loaded
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
    private Singleton() {}
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    //JVM ensures that class-loading and static field initializations are thread-safe,
    //hence no explicit synchronization is required
}
