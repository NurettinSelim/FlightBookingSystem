public class TravelReservation {

    private String bookingNumber;
    private Flight flight;
    private Passenger passenger;

    public TravelReservation(String bookingNumber, Flight flight, Passenger passenger) {
        this.bookingNumber = bookingNumber;
        this.flight = flight;
        this.passenger = passenger;
    }

    public String getBookingNumber() {
        return bookingNumber;
    }

    public Flight getFlight() {
        return flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }
}
