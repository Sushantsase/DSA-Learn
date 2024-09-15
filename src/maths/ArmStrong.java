package maths;

public class ArmStrong {
    public static int numLength(int digit) {
        int length = 0;
        while (digit > 0) {
            digit = digit / 10;
            length++;
        }
        return length;
    }

    public static boolean isArmStrong(int num) {
        int length = numLength(num);
        int ans = num;
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum = (int) (sum + Math.pow(digit, length));
            num = num / 10;
        }
        return ans == sum;
    }

    public static void main(String[] args) {
        int start = 15, end = 1000;

        for (int i = start; i <= end; i++){
            if(isArmStrong(i)){
                System.out.println(i);
            }
        }

    }
}
