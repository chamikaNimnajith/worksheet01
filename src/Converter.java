import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter length in centimeters: ");
        double cm = input.nextDouble();

        // Convert centimeters to inches (1 inch = 2.54 cm)
        double totalInches = cm / 2.54;

        // Convert inches to feet and inches
        int feet = (int) (totalInches / 12);  // 1 feet = 12 inches
        double inches = totalInches % 12;

        System.out.printf(" approximately %d feet and %.2f inches.%n", feet, inches);

        input.close();
    }
}
