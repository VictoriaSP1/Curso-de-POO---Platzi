import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car{
    String brand;
    String model;
    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String>seatsMaterial;
    //private Integer Passenger;

    public UberVan(String license, Account driver){
        super(license, driver);
    }

    public UberVan(String license, Account driver, Map<String, 
    Map<String, Integer>> typeCarAccepted, 
    ArrayList<String>seatsMaterial) {
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }

    @Override
    public void setPassenger(Integer passenger) {
        if(passenger == 6){
            this.Passenger = passenger;
        }
        else{
            System.out.println("Necesitas asignar 6 pasajeros");
        }
    }
}