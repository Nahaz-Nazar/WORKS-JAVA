package ride;


class AutoRide extends Ride {
    
    int calculateFare(int distance) {
        return distance * 10; // ₹10 per km
    }

    
    void rideType() {
        System.out.println("Auto Ride");
    }
}
