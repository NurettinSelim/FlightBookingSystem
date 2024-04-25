import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class FlightBookingSystem {

    private ArrayList<Flight> flights;
    private ArrayList<Booking> bookings;
    private ArrayList<String> availableSeats;

    public FlightBookingSystem() {
        this.flights = new ArrayList<>();
        this.bookings = new ArrayList<>();
        this.availableSeats = new ArrayList<>();
        flights.add(new Flight("F001", "Pak", "Istanbul", 500));
        flights.add(new Flight("F002", "Istanbul", "New York", 250));
        availableSeats.add("A1");
        availableSeats.add("A2");
        availableSeats.add("A3");
        availableSeats.add("A4");
    }

    private String selectSeatNumber() {
        Random random = new Random();
        int index = random.nextInt(availableSeats.size());
        return availableSeats.remove(index);
    }

    public void bookBusinessClass(BusinessFlight flight, Passenger passenger) {
        String bookingNumber = generateUniqueBookingNumber();
        String seatNumber = selectSeatNumber();
        Booking booking = new Booking(bookingNumber, flight, passenger, seatNumber, "Business Class");
        bookings.add(booking);
        System.out.println("Booking successful.\nBooking Details:");
        System.out.println(booking);
    }

    public void bookDomesticClass(Flight flight, Passenger passenger) {
        String bookingNumber = generateUniqueBookingNumber();
        String seatNumber = selectSeatNumber();
        Booking booking = new Booking(bookingNumber, flight, passenger, seatNumber, "Domestic Class");
        bookings.add(booking);
        System.out.println("Booking successful.\nBooking Details:");
        System.out.println(booking);
    }

    public void displayFlights() {
        if (flights.isEmpty()) {
            System.out.println("No flights available.");
            return;
        }
        System.out.println("Available Flights:");
        for (Flight flight : flights) {
            System.out.print(flight);
            System.out.println("--------------------");
        }
    }

    public void displayBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings available.");
            return;
        }
        System.out.println("Bookings:");
        for (Booking booking : bookings) {
            System.out.print(booking);
            System.out.println("--------------------");
        }
    }

    public Flight searchFlight(String origin, String destination) {
        for (Flight flight : flights) {
            if (flight.getOrigin().equals(origin) && flight.getDestination().equals(destination)) {
                return flight;
            }
        }
        return null;
    }

    public Flight searchFlight(String flightNumber) {
        for (Flight flight : flights) {
            if (flight.getFlightNumber().equals(flightNumber)) {
                return flight;
            }
        }
        return null;
    }

    private String generateUniqueBookingNumber() {
        return UUID.randomUUID().toString();
    }
}
