package factoryMethod;

public class phoneStore {
    public static void main(String[] args) {
        Phone s22=PhoneFabric.getPhone("S22","2600mah",10,20);
        Phone iphone14=PhoneFabric.getPhone("Iphone14Pro","3200mah",15,25);
        System.out.println("about information for S22 :");
        System.out.println(s22);
        System.out.println("about information for Iphone14ProMax  :");
        System.out.println(iphone14);
    }
}
