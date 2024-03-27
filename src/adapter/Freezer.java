package adapter;

public class Freezer implements ElectricalEquipments{
    private int volt;
    public Freezer(){
        this.volt=220;
    }
    @Override
    public int plugInAndRun() {
        System.out.println("The freezer is working...");
        return volt ;
    }
}
