package maths;

import java.util.Scanner;

public class PrimeNumberRange {
    public static boolean isPrime(int n) {
        int count =0;
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
            count++;
        }


        return true;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primeCount = 0;
        System.out.println("start");
        int start = scanner.nextInt();
        int last = scanner.nextInt();

        for (int i = start; i <= last; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                primeCount++;

            }

        }
        System.out.println("\"prime number uis\""+primeCount);
   scanner.close();
    }

}
