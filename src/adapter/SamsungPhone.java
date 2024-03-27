package adapter;

public class SamsungPhone implements Phone{
    private int operatingVolt;
    public SamsungPhone(){
        operatingVolt=5;
    }
    @Override
    public int charge() {
        System.out.println("Samsung phone is charging...");
        return operatingVolt;
    }
}
