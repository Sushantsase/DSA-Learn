package string;

/*    String Compression
 * Given String = aaabbcderfgg
 * question  output -> abcdefg
 * output_> a3b2cde2fg2
 * */

import java.util.Scanner;

public class DuplicateRemoveAndCount {

    public static void removeDuplicateCompression(String str) {
        int n = str.length();
        if (n == 0) return;
        String ans = str.charAt(0) + "";  //Using this we are converting character to String by adding ""
        int i = 1;
        while (i < n) {
            while (i < n && ans.charAt(ans.length() - 1) == str.charAt(i)) {
                i++;
            }
            if (i < n) {
                ans += str.charAt(i);
                i++;
            }
        }
        System.out.println("Removing Duplicate        " + ans);
    }

    public static void removeDuplicateCompressionCount(String str) {
        int n = str.length();
        if (n == 0) return;
        String ans = str.charAt(0) + "";  //Using this we are converting character to String by adding ""
        int i = 1;
        int count =0, changes =0;
        while (i < n) {
            count=1;
            while (i < n && ans.charAt(ans.length() - 1) == str.charAt(i)) {
                i++;
                count++;
            }
            changes++;
            if(count>1){
                ans+=count;
            }
            if (i < n) {
                ans += str.charAt(i);
                i++;
            }
        }
        System.out.println("Removing Duplicate        " + ans);
        System.out.println(changes);
    }


//    public static String countCompression(String str) {
//
//    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //String str = scn.next();  //abcssssaaasdas
        String str = "aaannnsdddddddpkkrrsdf";
        System.out.println("Original String " + str);
        removeDuplicateCompression(str);
     removeDuplicateCompressionCount(str);
    }

}
