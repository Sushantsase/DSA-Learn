package array.basic;

public class MaxSumSubArrayLeetcode {

    public static int maxSumSubArray(int[] arr) {
        int csum = arr[0];
        int osum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(csum>0){
                csum+=arr[i];
            }else {
                csum = arr[i];
            }
            if(csum>osum){
               osum= csum;
            }

        }
        return osum;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
        int maxSum = maxSumSubArray(arr);
        System.out.println(maxSum);
    }
}
