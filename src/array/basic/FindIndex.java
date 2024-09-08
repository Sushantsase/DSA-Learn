package array.basic;

import java.util.Scanner;

public class FindIndex {

    //Found Index

    public static int returnIndex(int[] arr, int data){
        int foundAtIndex = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==data){
                foundAtIndex = i;
                break;
            }

        }

    return foundAtIndex;
    }

    public static int returnIndex2(int[] arr, int data){
        int foundAtIndex = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==data){
                return i;

            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{40,25,9,66,3,78};
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
//        int index =returnIndex(arr,a);
//        System.out.println(index);

        int index2 =returnIndex2(arr,a);
        System.out.println(index2);
    }
}
