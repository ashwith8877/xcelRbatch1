import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the base and height of the triangle
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        // Calculate the area of the triangle
        double area = 0.5 * base * height;

        // Display the result
        System.out.printf("The area of the triangle is: %.2f%n", area);

        // Close the scanner
        scanner.close();
    }
}
