package rent;


public class Car implements Vehicle, FuelBased {
    
    
    public void start() {
        System.out.println("Car engine started."); 
    }

   
    public void stop() {
        System.out.println("Car engine stopped.");
    }

    
    public void refuel() {
        System.out.println("Car is refueling at the station.");
    }
}
