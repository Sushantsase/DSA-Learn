package basic;

import java.util.Scanner;

public class reverseNumber {
    public static void reverse(int number) {
        int rev = 0;
        while (number != 0) {  //565656
            rev = rev * 10 + number % 10; // rev = number%10;
            number = number / 10;        //rev =rev*10+
        }
        System.out.println(rev);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        reverse(x);
    }
}
