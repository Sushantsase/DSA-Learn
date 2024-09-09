package string;

public class RemoveDuplicateLetter {
    public static String removeDuplicate(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            int j = 0;
            for ( j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) //same character found
                {
                    break;
                }
            }
            if (i == j) {
                ans += s.charAt(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String scn = "abaabcccfffplsacb";
        System.out.println(removeDuplicate(scn));
    }
}
