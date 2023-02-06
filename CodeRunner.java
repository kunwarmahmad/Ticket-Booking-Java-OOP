
import java.util.Scanner;

public class CodeRunner {
    public static void main(String[] args) {

        System.out.println("1-Bus");
        System.out.println("2-Train");
        System.out.println("3-Plane");
        System.out.print("Press any one Option : ");
        int choice;
        Scanner input = new Scanner(System.in);
        choice = input.nextInt();
        if (choice == 1) {
            Travel travel = new Bus();
            PrintingDetails p = new PrintingDetails();
            p.printing(travel);
        }

        if (choice == 2) {
            Travel travel = new Train();
            System.out.println("Enter Lagguage Details");
            System.out.print("Lagguage Weight : " );
            travel.luggageWeight = input.nextDouble();
            System.out.print("Lagguage ID : ");
            travel.luggageIdentification = input.nextInt();
            PrintingDetails p = new PrintingDetails();
            p.printing(travel);

        }

        if (choice == 3) {
            Travel travel = new Plane();
            System.out.print("Lagguage Weight : " );
            travel.luggageWeight = input.nextDouble();
            System.out.print("Lagguage ID : ");
            travel.luggageIdentification = input.nextInt();
            PrintingDetails p = new PrintingDetails();
            p.printing(travel);
        }

    }
}