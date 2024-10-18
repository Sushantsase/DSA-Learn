package array.basic;

public class ArrayMissingNumber {
    public  static int missingNumber(int[] nums) {
        int n = nums.length;
        System.out.println(n);
        int sum = (n*(n+1))/2;
        int csum=0;
        for(int i=0;i<n;i++){
            csum+=nums[i];
        }
        return sum-csum;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{9,6,4,2,3,5,7,0,1};
//        ArrayMissingNumber an = new ArrayMissingNumber(); // with Instance
//        int ms =an.missingNumber(arr);
        System.out.println(missingNumber(arr));
    }
}
