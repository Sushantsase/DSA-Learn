package stack;

import java.util.Stack;

public class ParenthesisDemo {
    public static boolean isBalanced(String a){
        Stack<Character> s= new Stack<>();
        for(char i:a.toCharArray()){
            if(i=='(' || i=='{' ||i=='[' ){
                s.push(i);
            } else if (i==')' || i=='}' ||i==']' ) {
                if(s.isEmpty() || !matchingPair(s.pop(),i)){
                    return false;
                }

            }

        }
return s.isEmpty();
    }
    public static boolean matchingPair(char a, char b){
        return (a=='(' && b==')') ||
                (a=='{' && b=='}') ||
                (a=='[' && b==']');
    }
    public static void main(String[] args) {
        String expression = "{[()]}";  // Example input
        if (isBalanced(expression)) {
            System.out.println("The parentheses are balanced.");
        } else {
            System.out.println("The parentheses are not balanced.");
        }
    }
}
