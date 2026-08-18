package ride;


class CarRide extends Ride {
    
    int calculateFare(int distance) {
        return distance * 20; // ₹20 per km
    }

   
    void rideType() {
        System.out.println("Car Ride");
    }
}
