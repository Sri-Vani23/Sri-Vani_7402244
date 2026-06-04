import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        int year;
        if (args.length >= 1) {
            try {
                year = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid argument. Please provide a valid year.");
                return;
            }
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a year: ");
            if (!sc.hasNextInt()) {
                System.out.println("That's not a valid integer year.");
                sc.close();
                return;
            }
            year = sc.nextInt();
            sc.close();
        }

        boolean isLeap = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeap = true;
                } else {
                    isLeap = false;
                }
            } else {
                isLeap = true;
            }
        } else {
            isLeap = false;
        }

        if (isLeap) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
