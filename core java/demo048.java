import java.util.Scanner;

public class demo048 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Variable to store the sum of digits
        int sum = 0;

        // Handling negative numbers
        if (number < 0) {
            number = -number;
        }

        // Calculating the sum of digits
        while (number > 0) {
            sum += number % 10;  
            number /= 10;     
        }

        System.out.println("Sum of digits: " + sum);

        scanner.close();
    }
}
