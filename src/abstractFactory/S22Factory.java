package abstractFactory;

public class S22Factory implements PhoneFactory{
    @Override
    public Phone getPhone(String model, String battery, int width, int height) {
        return new S22(model,battery,width,height);
    }
}
