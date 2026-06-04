import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        if (args.length >= 3) {
            try {
                double a = Double.parseDouble(args[0]);
                char op = args[1].charAt(0);
                double b = Double.parseDouble(args[2]);
                calculateAndPrint(a, b, op);
                return;
            } catch (Exception e) {
                System.out.println("Invalid arguments, switching to interactive mode.");
            }
        }
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter operation (+ - * /): ");
        char op = sc.next().charAt(0);
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        calculateAndPrint(a, b, op);
        sc.close();
    }

    private static void calculateAndPrint(double a, double b, char op) {
        double result;
        switch (op) {
            case '+': result = a + b; break;
            case '-': result = a - b; break;
            case '*': result = a * b; break;
            case '/':
                if (b == 0) {
                    System.out.println("Error: Division by zero");
                    return;
                }
                result = a / b; break;
            default:
                System.out.println("Invalid operation: " + op);
                return;
        }
        System.out.println("Result: " + result);
    }
}
