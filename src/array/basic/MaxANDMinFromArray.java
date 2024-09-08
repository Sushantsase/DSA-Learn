package array.basic;

import java.util.*;

public class MaxANDMinFromArray {
    static Scanner scanner = new Scanner(System.in);

    // Max Element from the array
    public static int maxElement(int[] arr) {
        if (arr == null && arr.length == 0) return 0;
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static int maxElement2(int[] arr) {
        if (arr == null && arr.length == 0) return Integer.MIN_VALUE;
        int max = -(int)1e9;
        for (int ele:arr) {
     max = Math.max(max,ele);
        }

        return max;
    }


    // Minimum Element from the array
     public static int minElement(int[] arr){
        int min = arr[0];
        if(arr.length == 0 && arr ==null) return 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

    public static int minElement2(int[] arr){
        int min = arr[0];
        if(arr.length == 0 && arr ==null) return Integer.MAX_VALUE;
        for(int ele:arr){
            min = Math.min(min,ele);
        }
        return min;
    }




    public static void input(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
    }

    public static int[] input2(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void display2(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
////        int[] array = new int[a];
////        input(array);
////        //int arr[]=       input2(a);
////        display2(array);
//
//
//        int[] arr = input2(a);
//        display2(arr);
//        System.out.println(arr);

       int[] arrw = new int[]{41, 56, 45, 7, 96, 3};
        //int[] arr = new int[0];
       // int maxNumberw = maxElement(arrw);
        int maxNumberw = maxElement2(arrw);
        System.out.println(maxNumberw);

//        int minNumberw = minElement2(arrw);
//        int maxNumberww = maxElement2(arrw);
//        System.out.println(minNumberw);

//Using Streams

        int[] arr = new int[]{41, 56, 45, 7, 96, 3};
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(max);

        int min = Arrays.stream(arr).min().getAsInt();
        System.out.println(min);

        Arrays.sort(arr);
        display2(arr);
        System.out.println(arr);

        //Using Collection

        List<Integer> maxList = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            maxList.add(arr[i]);
        }
        System.out.println(maxList);

        System.out.println(Collections.max(maxList));
        System.out.println(Collections.min(maxList));
    }
}
