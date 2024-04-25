public class Flight {

    private String flightNumber;
    private String origin;
    private String destination;
    private double fare;

    public Flight(String flightNumber, String origin, String destination, double fare) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.fare = fare;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public double getFare() {
        return fare;
    }

    public BusinessFlight toBusinessFlight() {
        return new BusinessFlight(flightNumber, origin, destination, fare , true);
    }


    public String toString() {
        return "Flight Number: " + flightNumber + "\n" +
                "Origin: " + origin + "\n" +
                "Destination: " + destination + "\n" +
                "Fare: " + fare + "\n";
    }
}
