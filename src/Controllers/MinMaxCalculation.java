import java.util.Scanner;

public class MinMaxCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Initialize variables for minimum and maximum values
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Loop to input and calculate min/max values
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int num = scanner.nextInt();

            // Update min and max values
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        // Display the minimum and maximum values
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);

        // Close the scanner
        scanner.close();
    }
}
