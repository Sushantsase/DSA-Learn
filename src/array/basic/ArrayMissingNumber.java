package array.basic;

public class ArrayMissingNumber {

    public  static int missingNumberOptimize(int[] nums) {
        int n = nums.length;
        int start = nums[0];
        int end = nums[n-1];
        System.out.println(start);
        System.out.println(end);
        int sum = (end*(end+1)/2)- ((start-1)*start/2);
        int csum=0;
        for(int i=0;i<n;i++){
            csum+=nums[i];
        }
        return sum-csum;
    }
    public  static int missingNumber(int[] nums) {
        int n = nums.length;
        int start = nums[0];
        System.out.println(n);
        int sum = (n*(n+1))/2;
        int csum=0;
        for(int i=start;i<n;i++){
            csum+=nums[i];
        }
        return sum-csum;
    }





    public static void main(String[] args) {
        int[] arr = new int[]{5,6,7,9};
//        ArrayMissingNumber an = new ArrayMissingNumber(); // with Instance
//        int ms =an.missingNumber(arr);
        System.out.println("Missing number is "+missingNumberOptimize(arr));
    }
}
