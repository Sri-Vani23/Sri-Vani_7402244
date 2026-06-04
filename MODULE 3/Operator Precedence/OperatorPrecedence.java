public class OperatorPrecedence {
    public static void main(String[] args) {
        int result1 = 10 + 5 * 2; // multiplication before addition
        int result2 = (10 + 5) * 2; // parentheses change the order
        int result3 = 20 / 4 + 2 * 3; // division and multiplication before addition
        int result4 = 20 / (4 + 2) * 3; // parentheses first, then division and multiplication

        System.out.println("Expression: 10 + 5 * 2");
        System.out.println("Result: " + result1);
        System.out.println("Explanation: multiplication happens before addition, so 5 * 2 = 10, then 10 + 10 = 20.");
        System.out.println();

        System.out.println("Expression: (10 + 5) * 2");
        System.out.println("Result: " + result2);
        System.out.println("Explanation: parentheses force addition first, so (10 + 5) = 15, then 15 * 2 = 30.");
        System.out.println();

        System.out.println("Expression: 20 / 4 + 2 * 3");
        System.out.println("Result: " + result3);
        System.out.println("Explanation: division and multiplication are evaluated before addition: 20 / 4 = 5 and 2 * 3 = 6, then 5 + 6 = 11.");
        System.out.println();

        System.out.println("Expression: 20 / (4 + 2) * 3");
        System.out.println("Result: " + result4);
        System.out.println("Explanation: parentheses first, so 4 + 2 = 6, then 20 / 6 = 3 (integer division), then 3 * 3 = 9.");
    }
}
