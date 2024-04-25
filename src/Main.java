import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final FlightBookingSystem flightBookingSystem = new FlightBookingSystem();

        // Display available flights
        displayFlights(flightBookingSystem);

        System.out.println("--------------------");

        // Search for a flight
        searchFlight(scanner, flightBookingSystem);

        System.out.println("--------------------");

        // Book a flight
        bookFlight(scanner, flightBookingSystem);
    }

    private static void displayFlights(FlightBookingSystem flightBookingSystem) {
        flightBookingSystem.displayFlights();
    }

    private static void searchFlight(Scanner scanner, FlightBookingSystem flightBookingSystem) {
        System.out.println("Search for a flight");
        // Get origin and destination
        System.out.print("Enter origin: ");
        final String origin = scanner.nextLine();
        System.out.print("Enter destination: ");
        final String destination = scanner.nextLine();

        // Search for a flight with origin and destination
        final Flight flight = flightBookingSystem.searchFlight(origin, destination);
        if (flight == null) {
            System.out.println("No flights available.");
        } else {
            System.out.println("Flight found:");
            System.out.println(flight);
        }
    }

    private static void bookFlight(Scanner scanner, FlightBookingSystem flightBookingSystem) {
        System.out.println("Book a flight");
        // Create a passenger
        System.out.print("Enter your name: ");
        final String name = scanner.nextLine();
        System.out.print("Enter your email: ");
        final String email = scanner.nextLine();
        final Passenger passenger = new Passenger(name, email);

        // Search for a flight with flight number
        System.out.print("Enter the flight number: ");
        final String flightNumber = scanner.nextLine();
        final Flight bookedFlight = flightBookingSystem.searchFlight(flightNumber);
        if (bookedFlight == null) {
            System.out.println("Invalid flight number.");
        } else {
            // Select class
            System.out.println("Select class: \n1 - Business\n2 - Domestic");
            final int classType = scanner.nextInt();
            scanner.nextLine();
            /*
            The Scanner.nextInt method does not read the newline character in your input created by hitting "Enter".
            So, the next Scanner.nextLine call will read the newline character and return an empty string.
            Basically, the Scanner.nextLine consumes the newline character that didn't consume by Scanner.nextInt.
             */

            // Book the flight
            switch (classType) {
                case 1:
                    flightBookingSystem.bookBusinessClass(bookedFlight.toBusinessFlight(), passenger);
                    break;
                case 2:
                    flightBookingSystem.bookDomesticClass(bookedFlight, passenger);
                    break;
                default:
                    System.out.println("Invalid class type.");
                    break;
            }
        }
    }
}
