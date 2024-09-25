package recursion;

public class Factorial {

    public static int factShort(int n) {
        return n == 0 ? 1 : n * factShort(n - 1);
    }

    public static int fact(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        int n = 9;
        int factii = factShort(n);
        System.out.println(factii);
    }
}
