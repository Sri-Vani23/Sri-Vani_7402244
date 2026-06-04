import java.util.Scanner;

public class EvenOrOddChecker {
    public static void main(String[] args) {
        int number;
        if (args.length >= 1) {
            try {
                number = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid argument. Please enter an integer.");
                return;
            }
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            if (!sc.hasNextInt()) {
                System.out.println("That's not an integer.");
                sc.close();
                return;
            }
            number = sc.nextInt();
            sc.close();
        }

        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
}
