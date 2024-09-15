package maths;

public class factorial {
    public static int fact(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
//        int nfa = fact(n);
//        System.out.println(nfa);

        for (int i = n; i >= 1; i--) {
            System.out.print(i + " * ");
        }
        System.out.println("= "  + fact(n));
    }

}
