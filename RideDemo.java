abstract class Ride {
    protected double distance;

    Ride(double distance) {
        this.distance = distance;
    }

    abstract double calculateFare();

    void displayFare() {
        System.out.println(getClass().getSimpleName()
                + " for " + distance + " km: 	2" + calculateFare());
    }
}

class BikeRide extends Ride {
    BikeRide(double distance) {
        super(distance);
    }

    @Override
    double calculateFare() {
        return distance * 5;
    }
}

class AutoRide extends Ride {
    AutoRide(double distance) {
        super(distance);
    }

    @Override
    double calculateFare() {
        return distance * 8;
    }
}

class CarRide extends Ride {
    CarRide(double distance) {
        super(distance);
    }

    @Override
    double calculateFare() {
        return distance * 12;
    }
}

public class RideDemo {
    public static void main(String[] args) {
        Ride[] rides = {
            new BikeRide(6.5),
            new AutoRide(6.5),
            new CarRide(6.5)
        };

        for (Ride r : rides) {
            r.displayFare();
        }
    }
}
