package singleton;

public class Singleton {
    public static Singleton instance;
    public Singleton() {
    }
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
    public void getMessage() {
        System.out.println("Hello,i am a Singleton Pattern");
    }

}
