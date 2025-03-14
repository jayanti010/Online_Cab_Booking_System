package OnlineCabBookingSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create some users (drivers and passengers)
        User passenger1 = new User("John Doe", "john@example.com", "passenger");
        // Create a cab and assign a driver
        Cab cab1 = new Cab("CAB123", "Alice Smith");

        // Display available options to the user
        System.out.println("Welcome to the Online Cab Booking System!");
        System.out.println("1. Register Passenger");
        System.out.println("2. Register Driver");
        System.out.println("3. Book a Ride");
        System.out.println("4. Complete a Ride");
        System.out.println("Enter your choice (1-4): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        switch (choice) {
            case 1:
                // Register a passenger
                System.out.print("Enter name: ");
                String passengerName = scanner.nextLine();
                System.out.print("Enter email: ");
                String passengerEmail = scanner.nextLine();
                User passenger = new User(passengerName, passengerEmail, "passenger");
                System.out.println("Passenger registered: " + passenger.getName());
                break;

            case 2:
                // Register a driver
                System.out.print("Enter driver name: ");
                String driverName = scanner.nextLine();
                System.out.print("Enter driver email: ");
                String driverEmail = scanner.nextLine();
                User driver = new User(driverName, driverEmail, "driver");
                System.out.println("Driver registered: " + driver.getName());
                break;

            case 3:
                // Book a ride
                System.out.print("Enter pickup location: ");
                String pickup = scanner.nextLine();
                System.out.print("Enter drop location: ");
                String drop = scanner.nextLine();

                // Create a booking
                Booking booking = new Booking(passenger1, cab1, pickup, drop);
                booking.displayBookingInfo();
                break;

            case 4:
                // Complete a ride
                System.out.println("Enter booking ID (for simplicity, just 1 here): ");
                int bookingId = scanner.nextInt();
                if (bookingId == 1) {
                    Booking completedBooking = new Booking(passenger1, cab1, "Location A", "Location B");
                    completedBooking.completeRide();
                } else {
                    System.out.println("Invalid Booking ID.");
                }
                break;

            default:
                System.out.println("Invalid choice!");
                break;
        }

        scanner.close();
    }
}
