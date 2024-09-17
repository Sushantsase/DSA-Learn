package array.basic;

public class ArrayMissingNumber {
    public  int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n*(n+1))/2;
        int numSum =0;
        for(int i=0;i<nums.length;i++){
            numSum = numSum + nums[i];
        }
        return sum - numSum;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,0,1};
        ArrayMissingNumber an = new ArrayMissingNumber(); // with Instance
        int ms =an.missingNumber(arr);
        System.out.println(ms);
    }
}
