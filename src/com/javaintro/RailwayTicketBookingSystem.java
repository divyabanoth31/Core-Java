package com.javaintro;

import java.util.Scanner;

// Passenger Class
class Passenger {

	private String name;
	private int age;

	public Passenger(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}

// Booking Class
class Booking {

	private int bookingId;
	private Passenger passenger;
	private String source;
	private String destination;
	private String ticketType;
	private int numberOfTickets;
	private int totalFare;
	private boolean booked;

	public Booking(int bookingId, Passenger passenger, String source, String destination, String ticketType,
			int numberOfTickets, int totalFare) {

		this.bookingId = bookingId;
		this.passenger = passenger;
		this.source = source;
		this.destination = destination;
		this.ticketType = ticketType;
		this.numberOfTickets = numberOfTickets;
		this.totalFare = totalFare;
		this.booked = true;
	}

	public int getBookingId() {
		return bookingId;
	}

	public String getTicketType() {
		return ticketType;
	}

	public int getNumberOfTickets() {
		return numberOfTickets;
	}

	public int getTotalFare() {
		return totalFare;
	}

	public boolean isBooked() {
		return booked;
	}

	public void cancelBooking() {
		booked = false;
	}

	public void displayDetails() {

		System.out.println("\n----- TICKET DETAILS -----");

		System.out.println("Booking ID        : " + bookingId);
		System.out.println("Passenger Name    : " + passenger.getName());
		System.out.println("Passenger Age     : " + passenger.getAge());
		System.out.println("Source            : " + source);
		System.out.println("Destination       : " + destination);
		System.out.println("Ticket Type       : " + ticketType);
		System.out.println("Number of Tickets : " + numberOfTickets);
		System.out.println("Total Fare        : Rs." + totalFare);

		System.out.println("Booking Status    : " + (booked ? "Confirmed" : "Cancelled"));
	}
}

// Main Class
public class RailwayTicketBookingSystem {

	static Scanner sc = new Scanner(System.in);

	static int generalSeats = 50;
	static int sleeperSeats = 50;
	static int acSeats = 50;

	static int bookingId = 1001;
	static int bookingCount = 0;

	// Separate booking variables (No Arrays)
	static Booking b1, b2, b3, b4, b5;
	static Booking b6, b7, b8, b9, b10;

	public static void main(String[] args) {

		int choice;

		do {

			System.out.println("\n===== RAILWAY TICKET BOOKING SYSTEM =====");

			System.out.println("1. Book Ticket");
			System.out.println("2. Check Available Seats");
			System.out.println("3. Cancel Ticket");
			System.out.println("4. View Ticket Details");
			System.out.println("5. View All Bookings");
			System.out.println("6. Exit");

			choice = readInt("Enter your choice: ");

			switch (choice) {

			case 1:
				bookTicket();
				break;

			case 2:
				checkAvailableSeats();
				break;

			case 3:
				cancelTicket();
				break;

			case 4:
				viewTicket();
				break;

			case 5:
				viewAllBookings();
				break;

			case 6:
				System.out.println("Thank you for using Railway Booking System!");
				break;

			default:
				System.out.println("Invalid choice! Please try again.");
			}

		} while (choice != 6);

		sc.close();
	}

	// Read Integer with Exception Handling
	public static int readInt(String message) {

		while (true) {

			try {
				System.out.print(message);
				return Integer.parseInt(sc.nextLine());

			} catch (NumberFormatException e) {
				System.out.println("Please enter a valid number!");
			}
		}
	}

	// Book Ticket
	public static void bookTicket() {

		if (bookingCount == 10) {
			System.out.println("Maximum 10 bookings reached!");
			return;
		}

		System.out.print("Enter Passenger Name: ");
		String name = sc.nextLine().trim();

		if (name.isEmpty()) {
			System.out.println("Name cannot be empty!");
			return;
		}

		int age = readInt("Enter Passenger Age: ");

		if (age < 1 || age > 120) {
			System.out.println("Invalid Age! Age must be between 1 and 120.");
			return;
		}

		System.out.print("Enter Source: ");
		String source = sc.nextLine().trim();

		System.out.print("Enter Destination: ");
		String destination = sc.nextLine().trim();

		if (source.isEmpty() || destination.isEmpty() || source.equalsIgnoreCase(destination)) {

			System.out.println("Invalid Source or Destination!");
			return;
		}

		System.out.println("\nSelect Ticket Type:");

		System.out.println("1. General - Rs.200");
		System.out.println("2. Sleeper - Rs.500");
		System.out.println("3. AC      - Rs.1000");

		int type = readInt("Enter Ticket Type: ");

		String ticketType;
		int fare;
		int availableSeats;

		switch (type) {

		case 1:
			ticketType = "General";
			fare = 200;
			availableSeats = generalSeats;
			break;

		case 2:
			ticketType = "Sleeper";
			fare = 500;
			availableSeats = sleeperSeats;
			break;

		case 3:
			ticketType = "AC";
			fare = 1000;
			availableSeats = acSeats;
			break;

		default:
			System.out.println("Invalid Ticket Type!");
			return;
		}

		int tickets = readInt("Enter Number of Tickets: ");

		if (tickets <= 0) {
			System.out.println("Ticket quantity must be greater than zero!");
			return;
		}

		if (tickets > availableSeats) {
			System.out.println("Sorry! Not Enough Seats Available.");
			return;
		}

		int totalFare = fare * tickets;

		Passenger passenger = new Passenger(name, age);

		Booking booking = new Booking(bookingId, passenger, source, destination, ticketType, tickets, totalFare);

		// Store booking without using arrays
		switch (bookingCount) {

		case 0:
			b1 = booking;
			break;
		case 1:
			b2 = booking;
			break;
		case 2:
			b3 = booking;
			break;
		case 3:
			b4 = booking;
			break;
		case 4:
			b5 = booking;
			break;
		case 5:
			b6 = booking;
			break;
		case 6:
			b7 = booking;
			break;
		case 7:
			b8 = booking;
			break;
		case 8:
			b9 = booking;
			break;
		case 9:
			b10 = booking;
			break;
		}

		switch (type) {

		case 1:
			generalSeats -= tickets;
			break;

		case 2:
			sleeperSeats -= tickets;
			break;

		case 3:
			acSeats -= tickets;
			break;
		}

		System.out.println("\nTicket Booked Successfully!");

		System.out.println("Your Booking ID: " + bookingId);
		System.out.println("Total Fare: Rs." + totalFare);

		bookingId++;
		bookingCount++;
	}

	// Check Available Seats
	public static void checkAvailableSeats() {

		System.out.println("\n----- AVAILABLE SEATS -----");

		System.out.println("General Seats : " + generalSeats);
		System.out.println("Sleeper Seats : " + sleeperSeats);
		System.out.println("AC Seats      : " + acSeats);
	}

	// Find Booking by ID
	public static Booking findBooking(int id) {

		if (b1 != null && b1.getBookingId() == id)
			return b1;
		if (b2 != null && b2.getBookingId() == id)
			return b2;
		if (b3 != null && b3.getBookingId() == id)
			return b3;
		if (b4 != null && b4.getBookingId() == id)
			return b4;
		if (b5 != null && b5.getBookingId() == id)
			return b5;
		if (b6 != null && b6.getBookingId() == id)
			return b6;
		if (b7 != null && b7.getBookingId() == id)
			return b7;
		if (b8 != null && b8.getBookingId() == id)
			return b8;
		if (b9 != null && b9.getBookingId() == id)
			return b9;
		if (b10 != null && b10.getBookingId() == id)
			return b10;

		return null;
	}

	// Cancel Ticket
	public static void cancelTicket() {

		int id = readInt("Enter Booking ID to Cancel: ");

		Booking booking = findBooking(id);

		if (booking == null) {
			System.out.println("Booking Not Found!");
			return;
		}

		if (!booking.isBooked()) {
			System.out.println("Ticket Already Cancelled!");
			return;
		}

		booking.cancelBooking();

		int tickets = booking.getNumberOfTickets();

		switch (booking.getTicketType()) {

		case "General":
			generalSeats += tickets;
			break;

		case "Sleeper":
			sleeperSeats += tickets;
			break;

		case "AC":
			acSeats += tickets;
			break;
		}

		System.out.println("Ticket Cancelled Successfully!");
		System.out.println("Refund Amount: Rs." + booking.getTotalFare());
	}

	// View Ticket Details
	public static void viewTicket() {

		int id = readInt("Enter Booking ID: ");

		Booking booking = findBooking(id);

		if (booking == null) {
			System.out.println("Booking Not Found!");
		} else {
			booking.displayDetails();
		}
	}

	// View All Bookings
	public static void viewAllBookings() {

		if (bookingCount == 0) {
			System.out.println("No Bookings Available!");
			return;
		}

		System.out.println("\n===== ALL BOOKINGS =====");

		if (b1 != null)
			b1.displayDetails();
		if (b2 != null)
			b2.displayDetails();
		if (b3 != null)
			b3.displayDetails();
		if (b4 != null)
			b4.displayDetails();
		if (b5 != null)
			b5.displayDetails();
		if (b6 != null)
			b6.displayDetails();
		if (b7 != null)
			b7.displayDetails();
		if (b8 != null)
			b8.displayDetails();
		if (b9 != null)
			b9.displayDetails();
		if (b10 != null)
			b10.displayDetails();
	}
}
