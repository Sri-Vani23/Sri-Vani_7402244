import java.util.Scanner;

public class MultiplicationTable {
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
            System.out.print("Enter a number: ");
            if (!sc.hasNextInt()) {
                System.out.println("That's not an integer.");
                sc.close();
                return;
            }
            number = sc.nextInt();
            sc.close();
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
