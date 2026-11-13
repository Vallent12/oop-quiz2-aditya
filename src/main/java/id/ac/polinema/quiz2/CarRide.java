package id.ac.polinema.quiz2;

public class CarRide extends Ride implements Insurable{
    public CarRide(String RideId, Passenger passenger, double distanceKm) {
        super(RideId, passenger, distanceKm);
    }

    @Override
    public double calculateFare() {
        return getDistanceKm() * 4000;
    }

    @Override 
    public double insuranceFee() {
        return 3000;
    }   
}