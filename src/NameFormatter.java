import java.util.Scanner;

public class NameFormatter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your full name (first middle last): ");
        String fullName = input.nextLine();

        String[] names = fullName.split(" ");


        if (names.length == 3) {
            String firstName = names[0];
            String middleName = names[1];
            String lastName = names[2];


            String formattedName = lastName + ", " + firstName + " " + middleName.charAt(0) + ".";
            System.out.println("Formatted Name: " + formattedName);
        } else {
            System.out.println("Error: Please enter your name in the format 'first middle last'.");
        }


        input.close();
    }
}
