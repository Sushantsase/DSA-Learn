package array.basic;

//Subarray Sum Equals K
//Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
//Example 1:
//Input: nums = [1,1,1], k = 2
//Output: 2
//Example 2:
//
//Input: nums = [1,2,3], k = 3
//Output: 2
public class SubArraySum {
    public static void printInRange(int[] arr, int si, int ei) {
        while (si <= ei) {
            System.out.print(arr[si] + " ");
            si++;

        }
        System.out.println();
    }

    public static int printSubArraY(int[] arr, int k) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                printInRange(arr, i, j);
                sum += arr[j];
                if (sum == k) {
                    count++;
                }
                System.out.println("Sum is " + sum);

            }
        }
        return count;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int k = 3;
        System.out.println("Total count is "+printSubArraY(arr,k));
    }
}
