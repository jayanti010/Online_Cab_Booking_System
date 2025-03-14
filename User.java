package OnlineCabBookingSystem;

// User.java
public class User {
    private String name;
    private String email;
    private String role; // "driver" or "passenger"

    // Constructor
    public User(String name, String email, String role) {
        this.name = name;
        this.email = email;
        this.role = role;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }

    // Display User Info
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Role: " + role);
    }
}
