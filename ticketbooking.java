import java.util.ArrayList;
import java.util.Scanner;

class Ticket {
    private String eventName;
    private int seatNumber;
    private boolean isBooked;

    public Ticket(String eventName, int seatNumber) {
        this.eventName = eventName;
        this.seatNumber = seatNumber;
        this.isBooked = false;
    }

    public String getEventName() {
        return eventName;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void bookTicket() {
        this.isBooked = true;
    }

    @Override
    public String toString() {
        return "Event: " + eventName + " | Seat Number: " + seatNumber + " | Booked: " + (isBooked ? "Yes" : "No");
    }
}

class TicketBookingSystem {
    private ArrayList<Ticket> tickets;

    public TicketBookingSystem(String eventName, int totalSeats) {
        tickets = new ArrayList<>();
        for (int i = 1; i <= totalSeats; i++) {
            tickets.add(new Ticket(eventName, i));
        }
    }

    public void displayAvailableTickets() {
        System.out.println("\nAvailable Tickets:");
        for (Ticket ticket : tickets) {
            if (!ticket.isBooked()) {
                System.out.println(ticket);
            }
        }
    }

    public void displayBookedTickets() {
        System.out.println("\nBooked Tickets:");
        for (Ticket ticket : tickets) {
            if (ticket.isBooked()) {
                System.out.println(ticket);
            }
        }
    }

    public void bookTicket(int seatNumber) {
        if (seatNumber < 1 || seatNumber > tickets.size()) {
            System.out.println("Invalid seat number. Please try again.");
            return;
        }
        Ticket ticket = tickets.get(seatNumber - 1);
        if (ticket.isBooked()) {
            System.out.println("Sorry, this seat is already booked.");
        } else {
            ticket.bookTicket();
            System.out.println("Ticket successfully booked: " + ticket);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TicketBookingSystem bookingSystem = new TicketBookingSystem("Concert", 10); // Event with 10 seats

        while (true) {
            System.out.println("\n--- Ticket Booking System ---");
            System.out.println("1. View Available Tickets");
            System.out.println("2. Book a Ticket");
            System.out.println("3. View Booked Tickets");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    bookingSystem.displayAvailableTickets();
                    break;
                case 2:
                    System.out.print("Enter seat number to book: ");
                    int seatNumber = scanner.nextInt();
                    bookingSystem.bookTicket(seatNumber);
                    break;
                case 3:
                    bookingSystem.displayBookedTickets();
                    break;
                case 4:
                    System.out.println("Thank you for using the Ticket Booking System!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
