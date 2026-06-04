import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        int marks;
        if (args.length >= 1) {
            try {
                marks = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid marks. Please enter an integer between 0 and 100.");
                return;
            }
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter marks out of 100: ");
            if (!sc.hasNextInt()) {
                System.out.println("Please enter a valid integer.");
                sc.close();
                return;
            }
            marks = sc.nextInt();
            sc.close();
        }

        if (marks < 0 || marks > 100) {
            System.out.println("Marks should be between 0 and 100.");
            return;
        }

        char grade;
        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 80) {
            grade = 'B';
        } else if (marks >= 70) {
            grade = 'C';
        } else if (marks >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}
