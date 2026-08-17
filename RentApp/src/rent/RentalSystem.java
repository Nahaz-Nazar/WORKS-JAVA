package rent;

public class RentalSystem {
    public static void main(String[] args) {
        
       
        Car car = new Car();
        System.out.println("--- Car Simulation ---");
        car.start();
        car.refuel();
        car.stop();

        
        ElectricScooter scooter = new ElectricScooter();
        System.out.println("\n--- Electric Scooter Simulation ---");
        scooter.start();
        scooter.stop();
    }
}
