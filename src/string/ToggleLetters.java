package string;

public class ToggleLetters {
    public static String afterToggling(String str) {
        int n = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                sb.append((char) (ch-'a'+'A'));
            } else {
                sb.append((char) (ch -'A'+'a'));

            }
        }
        return sb.toString();
    }
    public static String afterToggling2(String str) {
        int n = str.length();
        String res ="";
        for (int i = 0; i < n; i++) {
            if(Character.isUpperCase(str.charAt(i))){
                res = res + Character.toLowerCase(str.charAt(i));

            }else{
                res = res + Character.toUpperCase(str.charAt(i));
            }
        }
        return res;
    }

    public static String afterToggling3(String str) {
        int n = str.length();
        StringBuilder res = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if(Character.isUpperCase(str.charAt(i))){
                res.append(Character.toLowerCase(str.charAt(i)));

            }else{
                res.append(Character.toUpperCase(i));
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        String str = "abAcdFewKKds";
        System.out.println(str);
        String toggle = afterToggling(str);
        System.out.println(toggle);

    }
}
