package array.basic;

import java.util.Scanner;

public class digitFrequencyNummberArray {
    public static Scanner scanner = new Scanner(System.in);

    public static void digitfreq(long n, int[] query) {
        int[] freq = new int[10];
        while (n != 0) {
            long d = n % 10;
            n /= 10;
            freq[(int) d]++;
        }
        for (int abc : freq) {
            System.out.print(abc+" ");
        }
    }

    public static void main(String[] args) {
     //   long number = scanner.nextLong();
       long number = 459975437;
        int[] query = new int[scanner.nextInt()];
        for (int i = 0; i < query.length; i++) {
            query[i] = scanner.nextInt();
        }
        digitfreq(number, query);


    }
}
