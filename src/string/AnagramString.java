package string;

import java.util.Arrays;

public class AnagramString {

    public static boolean isAnagram(String s, String t) {

        if (s.length() == 0 || t.length() == 0) return false;

        s = s.replaceAll("\\s", "").toLowerCase();
        t = t.replaceAll("\\s", "").toLowerCase();

        if (s.length() != t.length()) {
            return false;
        }

        char[] sh = s.toCharArray();
        char[] th = t.toCharArray();
        Arrays.sort(sh);
        System.out.println(sh);
        Arrays.sort(th);
        System.out.println(th);
        if(sh==th){
            System.out.println("hello");
        }
        else{
            System.out.println("sdf");
        }
        System.out.println(sh.equals(th));
        return sh.equals(th);
    }

    public static void main(String[] args) {
        String s = "anagram";
        String b = "nagaram";
        System.out.println(isAnagram(s, b));
    }
}
