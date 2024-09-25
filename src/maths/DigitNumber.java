package maths;

public class DigitNumber {
    public static int countNumber(int n) {
        int count = 0;
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;

            count++;

        }
        System.out.println(rev);
        return count;
    }

    public static void main(String[] args) {
        int n = 12454520;
        int len = countNumber(n);
        System.out.println(len);
    }
}
