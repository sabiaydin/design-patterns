package adapter;

public class Iron implements ElectricalEquipments{
    private int volt;
    public Iron(){
        this.volt=220;
    }
    @Override
    public int plugInAndRun() {
        System.out.println("The iron is working...");
        return volt;
    }
}
