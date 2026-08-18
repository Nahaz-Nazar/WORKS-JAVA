package ride;


abstract class Ride {
    
    abstract int calculateFare(int distance);

    
    void rideType() {
        System.out.println("Generic Ride");
    }
}
