/**
 * Hotel Booking Application
 * Demonstrates Use Case 1 + Use Case 2
 *
 * @author YourName
 * @version 1.0
 */

// Abstract Room class
abstract class Room {
    protected String roomType;
    protected int beds;
    protected double price;

    public Room(String roomType, int beds, double price) {
        this.roomType = roomType;
        this.beds = beds;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Room Type: " + roomType);
        System.out.println("Beds: " + beds);
        System.out.println("Price: ₹" + price);
    }
}

// Single Room
class SingleRoom extends Room {
    public SingleRoom() {
        super("Single Room", 1, 1000);
    }
}

// Double Room
class DoubleRoom extends Room {
    public DoubleRoom() {
        super("Double Room", 2, 1800);
    }
}

// Suite Room
class SuiteRoom extends Room {
    public SuiteRoom() {
        super("Suite Room", 3, 3000);
    }
}

// Main Application
public class HotelBookingApp {

    private static final String APP_NAME = "Hotel Booking System";
    private static final String VERSION = "Version 1.0";

    public static void main(String[] args) {

        // Use Case 1: Welcome Message
        System.out.println("=================================");
        System.out.println(" Welcome to " + APP_NAME);
        System.out.println(" " + VERSION);
        System.out.println("=================================");
        System.out.println("Application started successfully.");

        // Use Case 2: Room Types & Availability

        // Create room objects (Polymorphism)
        Room r1 = new SingleRoom();
        Room r2 = new DoubleRoom();
        Room r3 = new SuiteRoom();

        // Static availability
        int singleAvailable = 5;
        int doubleAvailable = 3;
        int suiteAvailable = 2;

        System.out.println("\n===== Room Availability =====");

        System.out.println("\n--- Single Room ---");
        r1.displayDetails();
        System.out.println("Available: " + singleAvailable);

        System.out.println("\n--- Double Room ---");
        r2.displayDetails();
        System.out.println("Available: " + doubleAvailable);

        System.out.println("\n--- Suite Room ---");
        r3.displayDetails();
        System.out.println("Available: " + suiteAvailable);

        System.out.println("\nExiting application...");
    }
}