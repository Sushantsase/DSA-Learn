package string;

public class StringEvenOdd {
    public static void callExample(String str){
        char[] ch = str.toCharArray();

        System.out.println(str.substring(0,1));
    }
    public static void main(String[] args) {
        String s = "52";
        callExample(s);
    }
}
