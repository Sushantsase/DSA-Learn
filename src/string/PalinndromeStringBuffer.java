package string;

public class PalinndromeStringBuffer {
    public static void main(String[] args) {

        StringBuffer str = new StringBuffer("abba");
        String rev = String.valueOf(str.reverse());
        System.out.println(rev);
        if (str.toString().equals(rev.toString())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
