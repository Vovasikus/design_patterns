package singleton;

public class Singleton {
    static Singleton uniqueInstance;

    private Singleton() {

    }

    static Singleton getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
