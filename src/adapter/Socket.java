package adapter;

public class Socket {

    public  void giveElectricity(ElectricalEquipments electricalEquipments){
       int volt = electricalEquipments.plugInAndRun();
        System.out.println("From the socket "+volt+" volt electricity is taken");
    }
}
