package array.basic;

public class SumOfTwoArray {
    public static void addTwoArray(int[] a, int[] b) {
        int[] ans = new int[Math.max(a.length, b.length) + 1];
        int i = a.length - 1, j = b.length - 1, k = ans.length - 1, carry = 0;

        while (k >= 0) {
            int sum = carry + ((i >= 0) ? a[i] : 0) + (j >= 0 ? b[j] : 0);
            ans[k] = sum % 10;
            carry = sum / 10;
            i--;
            j--;
            k--;
        }
        for (int idx = 0; idx < ans.length; idx++) {
            if (idx == 0 && ans[idx] == 0)
                continue;
            System.out.print(ans[idx] + " ");


        }
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{2, 4, 6, 4, 8, 3, 4};
        int[] arr2 = new int[]{9, 1, 5, 0, 9, 9, 9};
        addTwoArray(arr1, arr2);


    }
}
