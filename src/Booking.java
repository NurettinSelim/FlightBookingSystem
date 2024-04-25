public class Booking extends TravelReservation {

    private String seatNumber;
    private String classType;

    public Booking(String bookingNumber, Flight flight, Passenger passenger, String seatNumber, String classType) {
        super(bookingNumber, flight, passenger);
        this.seatNumber = seatNumber;
        this.classType = classType;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public String getClassType() {
        return classType;
    }

    public String toString() {
        return "Booking Number: " + getBookingNumber() + "\n" +
                "Passenger: " + getPassenger().getName() + "\n" +
                "Seat Number: " + seatNumber + "\n" +
                "Class Type: " + classType;
    }
}
