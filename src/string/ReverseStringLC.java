package string;

public class ReverseStringLC {
    public static void reverseStringArray(char[] s) {
        int i = 0, j = s.length - 1;
        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }

    public static void reverseString(String s) {
        char[] ch = s.toCharArray();
        reverseStringArray(ch);
        printString(ch);


    }

    public static void reverseStringExtraString(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);

        }
        System.out.println(rev);

    }

    public static void reverseStringStringBuilder(String s) {
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.reverse());
    }

    public static void printString(char[] s) {
        for (char a : s) {
            System.out.print(a + " ");


        }
    }

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        String b = "gfdabce";
       // reverseStringExtraString(b);
        reverseString(b);
        //reverseStringArray(s);
        //reverseStringStringBuilder(b);

    }
}
