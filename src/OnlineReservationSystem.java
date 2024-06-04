
import java.util.Scanner;

class ReservationSystem {
    String trainNumber;
    String trainName;
    String classType;
    String dateOfJourney;
    String from;
    String to;

    public void fillReservationDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter train number: ");
        trainNumber = scanner.nextLine();

        System.out.println("Enter train name: ");
        trainName = scanner.nextLine();

        // Similarly, get input for other details like classType, dateOfJourney, from, to

        // After filling all details, you can insert into database or display
        // or perform any other operations as per your requirement
    }
}

class CancellationForm {
    String pnrNumber;

    public void cancelTicket() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter PNR number: ");
        pnrNumber = scanner.nextLine();

        // Fetch details related to PNR number from database
        // Display details
        // Ask user to confirm cancellation and perform cancellation operation
    }
}

public class OnlineReservationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ReservationSystem reservationSystem = new ReservationSystem();
        CancellationForm cancellationForm = new CancellationForm();

        while (true) {
            System.out.println("1. Reservation");
            System.out.println("2. Cancellation");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    reservationSystem.fillReservationDetails();
                    break;
                case 2:
                    cancellationForm.cancelTicket();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please enter again.");
            }
        }
    }
}
