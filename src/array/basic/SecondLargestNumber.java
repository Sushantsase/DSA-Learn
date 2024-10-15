package array.basic;

import java.util.Arrays;

public class SecondLargestNumber {

    public static int findLargest(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findSecondLargestUsingSort(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 2];

    }

    public static int findSecondLargest(int[] arr) {
        if(arr.length<2){return 0;}
        int secondMax = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i]>secondMax && arr[i]!=max) {
                secondMax=arr[i];

            }
        }
        if(secondMax==Integer.MIN_VALUE){
           throw new IllegalArgumentException("No seconf largest number");
        }
        return secondMax;

    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 2, 7, 9};
        System.out.println("Largest: " + findLargest(arr));
        System.out.println("Second Largest: " + findSecondLargestUsingSort(arr));
        System.out.println("Second Largest: " + findSecondLargest(arr));
    }
}
