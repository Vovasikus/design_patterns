package singletonmultithreadingmorefast;

public class Singleton {
    static volatile Singleton uniqueInstance;

    private Singleton() {

    }

    static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) { //Синхронизация только при первом вызове
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
