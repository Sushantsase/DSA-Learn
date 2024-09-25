package recursion;

public class BasicRecursion {

    public static void increasingOrder(int a, int b) {
        if (a > b) {
            return;
        }
        System.out.print(a + " ");
        increasingOrder(a + 1, b);
    }

    public static void decreasingOrder(int a, int b) {
        if (a > b) {
            return;
        }
        decreasingOrder(a + 1, b);
        System.out.print(a + " ");
    }

    public static void incDescEvenOdd(int a, int b) {
        if (a > b) {
            return;
        }
        if (a % 2 == 0) {
            System.out.print(a + " ");
        }
        incDescEvenOdd(a + 1, b);
        if (a % 2 != 0) {

            System.out.print(a + " ");
        }
    }


    public static void main(String[] args) {
        int a = 2, b = 8;
        increasingOrder(a, b);
        System.out.println();
        decreasingOrder(a, b);
        System.out.println();
        incDescEvenOdd(a, b);
    }
}
