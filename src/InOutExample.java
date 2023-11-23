import java.util.Scanner;

public class InOutExample {

    public static void main(String[] args) {

        // Check if the separator was passed as a command line argument
        if (args.length != 1) {
            System.out.println("Error: No separator was passed as a command line argument.");
            return;
        }

        // Retrieve the separator from the command line arguments
        String separator = args[0];

        Scanner scanner = new Scanner(System.in);

        String line1 = scanner.nextLine().toUpperCase();
        String line2 = scanner.nextLine().toUpperCase();
        String line3 = scanner.nextLine().toUpperCase();

        // Close the scanner
        scanner.close();

        System.out.println(line1 + separator + line2 + separator + line3);
	}
}
