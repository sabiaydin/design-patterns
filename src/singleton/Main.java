package singleton;

public class Main {
    public static void main(String[] args) {
        //Firstly you should initialize Singleton class
        Singleton singleton = Singleton.getInstance();
        singleton.getMessage();
    }
}
