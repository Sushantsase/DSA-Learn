package array.revision;

import java.util.HashSet;

public class SumOfArrayElement {

    public static void sumOfArrayElements(int[] a) {
        int n = a.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        System.out.println("Sum of array element is: " + sum);
    }

    public static void maxMin(int[] arr) {
        int n = arr.length;
        int min = (int) 1e9;
        int max = -(int) 1e9;
        if (arr == null || arr.length == 0) return;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        System.out.println("Array max element : " + max);
        System.out.println("Array min element : " + min);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int[] arr) {
        int si = 0;
        int ei = arr.length - 1;
        while (si <= ei) {
            swap(arr, si, ei);
            si++;
            ei--;
        }
        displayArray(arr);
    }

    public static boolean isSort(int[] arr) {
        for (int i = 0; i <= arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void sortArray(int[] arr) {
        boolean swap;
        for (int i = 0; i < arr.length - 1; i++) {
            swap = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
        displayArray(arr);
    }

    public static void removeDuplicateFromArray(int[] arr) {
        int count = 0;
        HashSet<Integer> unique = new HashSet<>();
        for (int i : arr) {
            if (unique.add(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("Count is : " + count);
    }


    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (k == 0 || nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                System.out.print(nums[k] + " ");
                k++;
            }
        }
        return k;
    }

    public static void displayArray(int[] arr) {
        for (int a : arr) {
            System.out.print(" " + a);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 5, 7, 7, 3, 45, 5, 8, 9, 7, 3, 6, 45, 8, 3};
        int[] arr1 = {};
        sumOfArrayElements(arr);
        maxMin(arr);
        displayArray(arr);
        System.out.println();
        reverse(arr);
        System.out.println();
        System.out.println(isSort(arr));
        sortArray(arr);
        System.out.println();
        removeDuplicateFromArray(arr);
        System.out.println("HELL");
        System.out.println(removeDuplicates(arr));
    }
}
