import java.util.Scanner;

public class FindMiddle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Enter your  word: ");
        String word = input.nextLine();


        if (word.length() % 2 == 1) {

            int middleIndex = word.length() / 2;

            char middleChar = word.charAt(middleIndex);
            System.out.println("The middle letter is: " + middleChar);
        } else {

            System.out.println("Error: The word length is not odd.");
        }


        input.close();
    }
}
