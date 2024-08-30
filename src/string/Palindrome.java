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
            for(int j=i;j< str.length();j++){
                if(isPalindrome(str,i,j-1)){
                    String s = str.substring(i,j+1);
                    System.out.println(s);
                }
            }

        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printAllPalindrome(str);
        //System.out.println(str);

//        String str = "abcdergff";
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
