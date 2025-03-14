package OnlineCabBookingSystem;

// Booking.java
public class Booking {
    private User passenger;
    private Cab cab;
    private String pickupLocation;
    private String dropLocation;
    private String status; // "booked" or "completed"

    // Constructor
    public Booking(User passenger, Cab cab, String pickupLocation, String dropLocation) {
        this.passenger = passenger;
        this.cab = cab;
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
        this.status = "booked"; // Initially, the booking status is "booked"
        cab.setAvailable(false); // Once booked, the cab is not available
    }

    // Method to display booking details
    public void displayBookingInfo() {
        System.out.println("Booking Details:");
        System.out.println("Passenger: " + passenger.getName());
        System.out.println("Cab Driver: " + cab.getDriverName());
        System.out.println("Pickup Location: " + pickupLocation);
        System.out.println("Drop Location: " + dropLocation);
        System.out.println("Status: " + status);
    }

    // Method to complete the ride
    public void completeRide() {
        this.status = "completed";
        cab.setAvailable(true); // The cab is now available after the ride is completed
        System.out.println("Ride completed!");
    }
}
