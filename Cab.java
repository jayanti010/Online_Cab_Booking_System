package OnlineCabBookingSystem;

// Cab.java
public class Cab {
    private String cabId;
    private String driverName;
    private boolean isAvailable;

    // Constructor
    public Cab(String cabId, String driverName) {
        this.cabId = cabId;
        this.driverName = driverName;
        this.isAvailable = true; // Assume cab is available by default
    }

    // Getter and Setter methods
    public String getCabId() {
        return cabId;
    }

    public String getDriverName() {
        return driverName;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // Display Cab Info
    public void displayCabInfo() {
        System.out.println("Cab ID: " + cabId);
        System.out.println("Driver: " + driverName);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }
}

