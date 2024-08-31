package leetcode;

import java.util.Scanner;

public class ReverseInteger {
    public static int reverseInterger(int x) {
        boolean negative = false;
        if(x<0){
            negative = true;
            x = -x;
        }
        int ans =0;

        while(x!=0){
            int rem = x % 10;
            ans = ans*10 + rem;
            x=x/10;
        }

        if(negative){
            ans = -ans;
        }
        if(ans>Integer.MAX_VALUE || ans <Integer.MIN_VALUE){
            return 0;
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int number = reverseInterger(x);
        System.out.println(number);
    }
}
