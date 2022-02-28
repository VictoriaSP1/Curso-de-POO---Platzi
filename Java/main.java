class Main {
    public static void main(String[] args) {
        //System.out.println("Hola mundo");
        
        UberX uberX = new UberX("AMQ123", new Account("Andrés Herrera ", "AND123 "), "Chevrolet ", "Sonic ");
        uberX.setPassenger(4);
        uberX.printDataCar();

        UberVan uberVan = new UberVan("HB892 ", new Account("Andrés Herrera ", "AND890 "));
        uberVan.setPassenger(6);
        uberVan.printDataCar();

        /*Car car = new Car("AMQ123", new Account("Andrés Herrera", "AND123"));
        car.Passenger = 4;
        car.printDataCar();

        Car car2 = new Car ("QWE567", new Account( "Andrea Herrera", "ANDA876"));
        car2.Passenger = 3; 
        car2.printDataCar();*/
    }
}
