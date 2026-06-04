public class TypeCastingExample {
    public static void main(String[] args) {
        double d = 9.78;
        int i = (int) d; // cast double to int (fraction truncated)
        System.out.println("double d = " + d);
        System.out.println("after casting to int: i = " + i);

        int x = 5;
        double y = (double) x; // cast int to double
        System.out.println("int x = " + x);
        System.out.println("after casting to double: y = " + y);
    }
}
