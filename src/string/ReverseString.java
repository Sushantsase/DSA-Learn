package string;

public class ReverseString {
    public static void reverse(String str) {
        char[] s = str.toCharArray();
        int i = 0, j = s.length - 1;
        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
        System.out.println(new String(s));

    }

    public static void main(String[] args) {
        String str = "Color";
        reverse(str);
    }
}
