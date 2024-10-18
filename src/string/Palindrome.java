package string;

import java.util.Scanner;

public class Palindrome {

    public static boolean isPalindrome(String str, int start, int end) {
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }


    public static void printAllPalindrome(String str) {  // cutting substring
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                if (isPalindrome(str, i, j)) {
                    String s = str.substring(i, j + 1);
                    System.out.println(s);
                }
            }

        }
    }

    public static void printLongestPalindrone(String str) {  // cutting substring
        String longest = "";
        int max = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                if (isPalindrome(str, i, j)) {
                    String s = str.substring(i, j + 1);

                    if (s.length() > max) {
                        longest = s;
                        max = longest.length();
                    }

                }
            }

        }
        System.out.println("Longest Palindrone is " + longest);
        System.out.println("Longest Palindrone is " + max);

    }


    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        String str = scn.next();
//        printAllPalindrome(str);
//        //System.out.println(str);

        String str = "cbbd";
        //printAllPalindrome(str);
          printLongestPalindrone(str);
//        System.out.println(str);
//        char ch = str.charAt(4);
//        System.out.println(str.length());
//        System.out.println(ch);
//
//        System.out.println(str.substring(5,8));
//        System.out.println(str.substring(8));
//        System.out.println(str +"xxx ");

    }
}
