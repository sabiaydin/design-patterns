package adapter;

public class Test {
    public static void main(String[] args) {
        Socket socket=new Socket();
        Iron iron=new Iron();
        Freezer freezer=new Freezer();
        socket.giveElectricity(iron);
        socket.giveElectricity(freezer);

        SamsungPhone samsungPhone=new SamsungPhone();
        PhoneAdapter adapter=new PhoneAdapter(samsungPhone);
        socket.giveElectricity(adapter);
    }
}
