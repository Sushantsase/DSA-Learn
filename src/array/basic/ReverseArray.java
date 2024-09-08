package array.basic;

import java.util.Arrays;

public class ReverseArray {

    //Extra Array
    public static void reverseArray(int[] arr) {
        System.out.println(arr.length);
        int[] reverseArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reverseArray[i] = arr[arr.length - i - 1];
            //System.out.print(reverseArray[i]+" ");
        }

        System.out.println(Arrays.toString(reverseArray));
//        for (int ele:reverseArray){
//            System.out.print(ele+" ");
//        }

    }

    //Two Pointer Method
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void reverseArrayTwoPointer(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    public static void print(int[] arr) {
    for(int ele:arr){
        System.out.print(ele+ " ");
    }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{20, 40, 65, 4, 8, 3, 44};
        //reverseArray(arr);
        reverseArrayTwoPointer(arr);
        print(arr);
    }
}