Here’s a sample README for your Ticket Booking System:

---

# Ticket Booking System 🎟️

A Java-based console application for booking tickets for events, allowing users to view available seats, book tickets, and check booked seats. This system ensures smooth management of ticket reservations with real-time seat availability checks and validation to prevent double-booking.

## Features

- **View Available Tickets**: Displays all unbooked seats for an event.
- **Book a Ticket**: Allows users to select a specific seat number and book it if available.
- **View Booked Tickets**: Lists all seats that have been booked for an event.
- **Validation**: Ensures seats are only booked once and provides feedback on booking status.

## Usage

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/ticket-booking-system.git
   ```
2. Compile and run the application in a Java environment:
   ```bash
   javac Main.java
   java Main
   ```
3. Use the on-screen menu to:
   - View available tickets
   - Book a ticket by entering the seat number
   - View booked tickets
   - Exit the application

## Classes

- **Ticket**: Represents a single event ticket with properties for event name, seat number, and booking status.
- **TicketBookingSystem**: Manages ticket operations, including displaying available and booked tickets and handling the booking process.
- **Main**: Contains the program's main menu loop for user interaction.

## Example Output

```
--- Ticket Booking System ---
1. View Available Tickets
2. Book a Ticket
3. View Booked Tickets
4. Exit
Choose an option: 
```

## Requirements

- Java 8 or higher

