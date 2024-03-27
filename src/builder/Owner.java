package builder;

public class Owner {
    public static void main(String[] args) {
        Home home1 = new Home();
        home1.setCity("Istanbul");
        home1.setDistrict("Atasehir");
        home1.setNeighbourhood("Ataturk");
        home1.setNumbOfRoom(3);
        home1.setHasPool(true);
        home1.setYear(2010);

        Home home2 = new Home("Istanbul", "Umraniye", "Tatlisu", 2008, 4, 3, 2, true, true, false, false);

        printHome(home1);
        System.out.println();
        printHome(home2);
    }
    private static void printHome(Home home) {
        System.out.println("\nInserted home : " + home );
    }
}
