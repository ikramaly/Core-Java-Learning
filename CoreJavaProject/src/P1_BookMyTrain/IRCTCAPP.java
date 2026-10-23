package P1_BookMyTrain;

import java.util.List;
import java.util.Scanner;

public class IRCTCAPP {
    private final Scanner scanner = new Scanner(System.in);
    private final UserService userService = new UserService();
    private final BookingService bookingService = new BookingService();

    public static void main(String[] args) {
        new IRCTCAPP().start();

    }

    public void start() {
        while (true) {
            System.out.println("-------------------Welcome to IRCTC APP --------------------");
            if (!userService.isLoggedIn()) {
                System.out.println("1. Register: ");
                System.out.println("2. Login: ");
                System.out.println("3. Exit: ");
                System.out.println("4 . Enter Choice: ");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1 -> register();
                    case 2 -> login();
                    case 3 -> exitApp();
                    default -> System.out.println("Invalid Choice.");
                }
            }else {
                showUserMenu();
            }
        }
    }

    public void register() {
        System.out.print("Enter username : ");
        String username = scanner.next();
        System.out.print("Enter Password : ");
        String password = scanner.next();
        System.out.print("Enter FullName : ");
        String  fullName = scanner.nextLine();
        System.out.print("Enter Contact : ");
        String contact = scanner.next();

        userService.registerUser(username,password,fullName,contact);
    }
    public void login(){
        System.out.println("Enter username : ");
        String username = scanner.next();
        System.out.println("Enter password : ");
        String password = scanner.next();
        userService.loginUser(username,password);
    }
    private void showUserMenu(){
        while ((userService.isLoggedIn())){
            System.out.print("-------------------User Menu------------------");
            System.out.print("1. Search Train : ");
            System.out.print("2. Book Ticket : ");
            System.out.print("3. View My Tickets : ");
            System.out.print("4. Cancel Tickets : ");
            System.out.print("5. View All Trains : ");
            System.out.print("5. Logout : ");
            System.out.print("Enter Choice ");

            int choice = scanner.nextInt();

            switch (choice){
                case 1 -> searchTrain();
                case 2 -> bookTicket();
                case 3 -> viewMyTicket();
                case 4 -> cancelTicket();
                case 5 -> bookingService.ListAllTrains();
                case 6 -> userService.loginUser();
                default -> System.out.println("Invalid Choice.");
            }
        }
    }
    private void searchTrain(){
        System.out.print("Enter source station : ");
        String source = scanner.next();
        System.out.print("Enter destination station : ");
        String destination = scanner.next();

        List<Train> trains = bookingService.searchTrain(source,destination);
        if (trains.isEmpty()){
            System.out.println("No Trains Found Between "+source+" and "+destination);
            return;
        }
        System.out.println("Trains Found: ");
        for (Train train:trains){
            System.out.println(train);
        }
        System.out.print("Do you want to book ticket ? (yes/no) : ");
        String choice = scanner.next();
        if (choice.equalsIgnoreCase("yes")){
            System.out.print("Enter Train ID to Book : ");
            int trainID = scanner.nextInt();
            System.out.print("Enter number of seats to book : ");
            int seats = scanner.nextInt();

            Ticket ticket = bookingService.bookTicket(userService.getCurrentUser(),trainID,seats);
            if (ticket!=null){
                System.out.println("Bookig Successdull !.");
                System.out.println(ticket);
            }
        }else {
            System.out.println("Returning to user menu...");
        }

    }
    private void bookTicket(){
        System.out.print("Enter source station : ");
        String source = scanner.next();
        System.out.print("Enter destination station : ");
        String destination = scanner.next();

        List<Train> trains = bookingService.searchTrain(source,destination);
        if (trains.isEmpty()){
            System.out.println("No Trains Available for Booking.");
            return;
        }
        System.out.println("Available Trains : ");
        for (Train train:trains){
            System.out.println(train);
        }

        System.out.print("Enter Train ID to Book : ");
        int trainID = scanner.nextInt();
        System.out.print("Enter number of seats to book : ");
        int seats = scanner.nextInt();

        Ticket ticket = bookingService.bookTicket(userService.getCurrentUser(),trainID,seats);
        if (ticket!=null){
            System.out.println("Bookig Successdull !.");
            System.out.println(ticket);
        }
    }
    private void viewMyTicket(){
        List<Ticket> ticketByUser = bookingService.getTicketBuyUser(userService.getCurrentUser());
        if (ticketByUser.isEmpty()){
            System.out.println("No Ticket Booked Yet.");
        }else {
            System.out.println("Your Tickets : ");
            for (Ticket ticket:ticketByUser){
                System.out.println(ticket);
            }
        }
    }
    private void cancelTicket(){
        System.out.print("Enter the Ticket ID to cancel : ");
        int ticketID = scanner.nextInt();
        bookingService.cancelTicket(ticketID,userService.getCurrentUser());
    }

    private void exitApp(){
        System.out.println("Thank You For Using IRTCT App.");
        System.exit(0);
    }
}
