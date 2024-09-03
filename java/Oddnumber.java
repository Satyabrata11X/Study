
import java.util.Scanner;

public class Oddnumber {

    public static void printSum(int n) {
        int sum = 0;

        // Iterate through all numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            // Check if the number is odd
            if (i % 2 != 0) {
                sum += i; // Add the odd number to the sum
            }
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a positive integer: ");
            int n = sc.nextInt();

            // Ensure the input is a positive integer
            if (n < 0) {
                System.out.println("The number must be non-negative.");
            } else {
                printSum(n);
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            sc.close(); // Close the scanner to avoid resource leaks
        }
    }
}
