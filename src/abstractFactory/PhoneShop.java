package abstractFactory;

public class PhoneShop {
    public static void main(String[] args) {
        S22Factory s22Factory = new S22Factory();
        Phone s22Phone = s22Factory.getPhone("S22", "2600mah", 10, 15);

        Iphone14Factory iphone14Factory = new Iphone14Factory();
        Phone iphone14Phone = iphone14Factory.getPhone("Iphone14Pro", "3600mah", 15, 25);

        Iphone14Factory iphone14=new Iphone14Factory();
        iphone14.getPhone("Iphone14Pro","3600mah",15,25);

        System.out.println(s22Phone);
        System.out.println(iphone14Phone);
    }
}
