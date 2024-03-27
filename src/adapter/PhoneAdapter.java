package adapter;

public class PhoneAdapter implements ElectricalEquipments{
    private Phone phone;
    public PhoneAdapter(Phone phone){
        this.phone=phone;
    }
    @Override
    public int plugInAndRun() {
        return phone.charge();
    }
}
