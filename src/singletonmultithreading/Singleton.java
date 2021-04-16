package singletonmultithreading;

public class Singleton {
    static Singleton uniqueInstance;

    private Singleton() {

    }

    static synchronized Singleton getInstance() {
            if (uniqueInstance == null) {
                uniqueInstance = new Singleton();
            }
            return uniqueInstance;
    }
}
