public class BusinessFlight extends Flight {
    private boolean hasWifi;
    public BusinessFlight(String flightNumber, String origin, String destination, double fare, boolean hasWifi) {
        super(flightNumber, origin, destination, fare);
        this.hasWifi = hasWifi;
    }
    public boolean getHasWifi() {
        return hasWifi;
    }
}
