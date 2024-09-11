package string;

/*    String Compression
 * Given String = aaabbcderfgg
 * question  output -> abcdefg
 * output_> a3b2cde2fg2
 * */

import java.util.HashSet;
import java.util.Scanner;

public class DuplicateRemoveAndCount {

    public static String removeDuplicates(String str) {
        // Check for null or empty string
        if (str == null || str.isEmpty()) return "";

        // Set to store unique characters
        HashSet<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();

        // Iterate through each character in the string
        for (char ch : str.toCharArray()) {
            // If the character is not in the set, add it to the result
            if (!seen.contains(ch)) {
                seen.add(ch);  // Mark the character as seen
                result.append(ch);  // Add to the result
            }
        }

        return result.toString();
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
//        String str = "aabaabcgdkjssaa";
//        System.out.println("Original String " + str);
//        System.out.println( removeDuplicates(str));
     //removeDuplicateCompressionCount(str);

         int b = 100;
        byte x=(byte) b;
        System.out.println(x);
    }

}
