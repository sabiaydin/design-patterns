package decorator;

public class Main {
    public static void main(String[] args) {

        CarProvider carProvider = new CarProvider();

        carProvider.createBMW(true, false, true, true);
        System.out.println("--");
        carProvider.createAudi(false, false, false, false);
        System.out.println("--");
        carProvider.createMercedes(true, true, true, true);

    }
}
