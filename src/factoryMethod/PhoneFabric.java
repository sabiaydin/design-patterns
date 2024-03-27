package factoryMethod;

public class PhoneFabric {
    public static Phone getPhone(String model,String battery,int width,int height){
        Phone phone;
        if ("S22".equalsIgnoreCase(model)){
            phone=new S22(model,battery,width,height);
        } else if ("Iphone14Pro".equalsIgnoreCase(model)) {
            phone=new Iphone14Pro(model,battery,width,height);
        }else {
            throw new RuntimeException("It is not a valid model");
        }
        return phone;
    }
}
