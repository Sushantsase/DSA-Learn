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

    public static double powOptimal(double a, double b){
        if(b==0){
            return 1;
        }
        return a* powOptimal(a,b-1);
    }

    public static void main(String[] args) {
        double a=2.00000, p = -2;
        System.out.println( powOptimal(a,p));
//       double ans = pow(a,p);
//        System.out.println(ans);
//
//        int ans1 = pow1(a,p);
//        System.out.println(ans1);
//
//        Random r = new Random();
//        int n = r.nextInt();
//        System.out.println("Random doubles: " +n);
//        int rr = (int)(Math.random()*52)                     ;
//        System.out.println("Random doubles: " + rr);
    }
}
