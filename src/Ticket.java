public class Ticket extends TravelReservation {

    private double price;
    private String ticketType;

    public Ticket(String bookingNumber, Flight flight, Passenger passenger, double price, String ticketType) {
        super(bookingNumber, flight, passenger);
        this.price = price;
        this.ticketType = ticketType;
    }

    public double getPrice() {
        return price;
    }

    public String getTicketType() {
        return ticketType;
    }
}
