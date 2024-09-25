package recursion;

import java.util.Random;

public class FindPower {
    public static int pow(int a, int b){

        return (int) Math.pow(a ,b);
    }

    public static int pow1(int a, int b){
        if(b==0){
            return 1;
        }
      return a* pow1(a,b-1);
    }

    public static int powOptimal(int a, int b){
        if(b==0){
            return 1;
        }
        return a* pow1(a,b-1);
    }

    public static void main(String[] args) {
        int a=2, p = 8;
       int ans = pow(a,p);
        System.out.println(ans);

        int ans1 = pow1(a,p);
        System.out.println(ans1);

        Random r = new Random();
        int n = r.nextInt();
        System.out.println("Random doubles: " +n);
        int rr = (int)(Math.random()*52)                     ;
        System.out.println("Random doubles: " + rr);
    }
}
