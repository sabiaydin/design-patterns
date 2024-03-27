package abstractFactory;

public class Iphone14Factory implements PhoneFactory{
    @Override
    public Phone getPhone(String model, String battery, int width, int height) {
        return new Iphone14Pro(model,battery,width,height);
    }
}
