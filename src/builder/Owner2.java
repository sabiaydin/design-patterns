package builder;

public class Owner2 {
    public static void main(String[] args) {
        Home h1 = HomeBuilder.startBuild("Istanbul","Umraniyye","Tatlisu",2008,3)
                .setHasChildPark(false)
                .setHasCarParking(true).build();
        printHome(h1);
    }

    private static void printHome(Home home) {
        System.out.println("\nInserted home : " + home);
    }
}
