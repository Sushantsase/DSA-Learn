package stack;

import java.util.Stack;

public class StackOperation{
    public static void main(String[] args){

        Stack sports = new Stack();

        Stack<Integer> str = new Stack<Integer>();
        str.push(1);
        str.push(1);
        str.push(1);
//str.pop();
        System.out.println(str);
        System.out.println(str.size());
        System.out.println(sports.empty());

        sports.push("Cricket");

        sports.push("Football");
        sports.push("Tennis");
        sports.push("Basketball");

        System.out.println(sports);
        sports.pop();
        System.out.println(sports);
        System.out.println(sports.empty());
        System.out.println(sports.peek());

        int loc =sports.search("Cricket");
        System.out.println(loc);

        int lo2 =sports.search("Football");
        System.out.println(lo2);

        int loc2 =sports.search("Tennis");
        System.out.println(loc2);
        int loc3 =sports.search("Basketball");
        System.out.println(loc3);


//        empty()
//        push()
//        pop()
//        search()
//        peek()


    }

}