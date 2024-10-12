class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                printInRange(nums, i, j);
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;

    }

    public void printInRange(int[] arr, int si, int ei) {
        while (si <= ei) {
            si++;
        }
    }
}